package bank;

import java.util.Scanner;

public class BankMain {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  boolean run = true;
  
  Client client = new Client();
  BankSQL sql = new BankSQL();
  
  int menu =0;
  
  while(run) {
   System.out.println("************************************");
   System.out.println("|1.DB접속 |2.DB접속해지 |3.계좌생성 |4.입금 |");
   System.out.println("| 5.출금   |   6.잔액     |7. 송금      |8.종료 |");
   System.out.println("*************************************");
   System.out.println("메뉴 선택 >> ");
   System.out.println();
   menu = sc.nextInt();
   
   switch(menu) {
   case 1:
    sql.connect();
    break;
   case 2:
    sql.conClose();
    break;
   case 3:
    int clientNumber = sql.clientNumber() + 1;
    System.out.println("회원정보를 입력해주세요.");
    System.out.print("이름 >> ");
    String name = sc.next();
    System.out.print("계좌번호 >> ");
    String accountNumber = sc.next();
    System.out.print("생성 입금액 >> ");
    int balance = sc.nextInt();
    client = new Client(clientNumber,name,accountNumber,balance);
    sql.insertClient(client);
    break;
   case 4:
    System.out.print("계좌번호 >> ");
    accountNumber = sc.next();
    System.out.print("입금액 >> ");
    balance = sc.nextInt();
    sql.deposit(accountNumber,balance);
    break;
   case 5:
    System.out.print("계좌번호 >> ");
    accountNumber = sc.next();
    System.out.print("출금액 >> ");
    int wBalance = sc.nextInt(); //출금액
    int cBalance = sql.checkBalance(accountNumber); //현재잔액
    if(cBalance > wBalance) {
     sql.withdraw(accountNumber, wBalance);
    }else {
     System.out.println("출금액이" + (wBalance-cBalance) + "원 부족합니다. ");
     System.out.println("현재잔액 : " + cBalance + "요청 출금액 : " + wBalance + "원");
    }
    
    sql.withdraw(accountNumber,wBalance);
   
    break;
   case 6:
    System.out.println("조회할 계좌번호 >> ");
    accountNumber = sc.next();
    balance = sql.checkBalance(accountNumber);
    System.out.println("잔액 : " + balance);
    break;
   case 7: 
    System.out.println("보내는분 계좌 >> ");
    String sendAccount = sc.next();
    boolean checkSend = sql.checkAccount(sendAccount);
    
    System.out.println("받는분 계좌 >>");
    String receiveAccount = sc.next();
    boolean checkReceive = sql.checkAccount(receiveAccount);
    
    if(checkSend && checkReceive) {
    System.out.println("송금액 >> ");
    balance = sc.nextInt();
    
    sql.transfer(sendAccount,receiveAccount,balance);
    }else {
     System.out.println("계좌번호가 틀렸습니다.");
    }
    break;
   case 8:
    run= false;
    System.out.println("프로그램을 종료하겠습니다.");
    break;    
   default :
    System.out.println("다시 입력해주세요.");
    break;
   }
  }
 }
} 