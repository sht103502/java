package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankSQL {
 
 Connection con = null;  //DB 접속을 위한 변수언언
 
 //쿼리문 전송을 위한 변수 선언
 Statement stmt = null;
 PreparedStatement pstmt = null;
 
 ResultSet rs = null;
 
 public void connect() {
  con = DBC.DBConnect();
 }    //DBC.DBConnect() = DBC클래스 DBConnect메소드의 con값이다.    
 
 public void conClose() {
  try {
   con.close();
  } catch (SQLException se) {
   se.printStackTrace();
  }
 }
 
 public int clientNumber() {
  String sql = "SELECT COUNT(*)FROM BANK";
  int clientNumber = 0;
  try {
   pstmt = con.prepareStatement(sql);
   rs = pstmt.executeQuery();
   
   if(rs.next()) {
    clientNumber = rs.getInt(1);
   }
   
  } catch (SQLException se) {
   se.printStackTrace();
  }
  
  return clientNumber;
 }
 
 public void insertClient(Client client) {
  String sql = "INSERT INTO BANK VALUES(?,?,?,?)";
  int insertResult = 0;
  
  try {
   pstmt = con.prepareStatement(sql);
   
   pstmt.setInt(1, client.getClientNumber());
   pstmt.setString(2, client.getName());
   pstmt.setString(3, client.getAccountNumber());
   pstmt.setInt(4, client.getBalance());
   
   int count = pstmt.executeUpdate();
   
   if(count >0) {
    System.out.println("등록성공!");
   }else {
    System.out.println("등록실패");
   }
     
  } catch (SQLException se) {
    se.printStackTrace();
  }
 }
  public boolean checkAccount(String AccountNumber) {
   boolean checkResult = false;
   String sql = "SELECT ACCOUNTNUMBER FROM BANK WHERE ACCOUNTNUMBER =?";
   
   try {
    pstmt =con.prepareStatement(sql);
    
    pstmt.setString(1, AccountNumber);
    rs = pstmt.executeQuery();
    
    if(rs.next()) {
     checkResult = true;
    } else {
     checkResult = false;
    }
   } catch(SQLException se) {
    se.printStackTrace();
   }
   return checkResult;
  }

 public void deposit(String accountNumber, int balance) {
  String sql ="UPDATE BANK SET BALANCE = BALANCE+? WHERE ACCOUNTNUMBER=?";
  try {
   pstmt=con.prepareStatement(sql);
   
   pstmt.setInt(1, balance);
   pstmt.setString(2, accountNumber);
   
   int count = pstmt.executeUpdate();
   
   if(count > 0) {
    System.out.println("입금 성공!");
   }else{
    System.out.println("입금 실패ㅠㅠ");
   }
   
  } catch (SQLException se) {
   
   se.printStackTrace();
  }
 }

 public void withdraw(String accountNumber, int balance) {
  String sql ="UPDATE BANK SET BALANCE = BALANCE-? WHERE ACCOUNTNUMBER=?";
  try {
   pstmt=con.prepareStatement(sql);
   
   pstmt.setInt(1, balance);
   pstmt.setString(2, accountNumber);
 
   int count = pstmt.executeUpdate();
 
   if(count > 0) {
    System.out.println("출금 성공!");
   }else{
    System.out.println("출금 실패ㅠㅠ");
   }
 
  }catch(SQLException se) {
   se.printStackTrace();
 }
}

 public int checkBalance(String accountNumber) {
  String sql ="SELECT BALANCE FROM BANK WHERE ACCOUNTNUMBER=?";
  int balance=0;
  
  try {
   pstmt = con.prepareStatement(sql);
   
   pstmt.setString(1, accountNumber);
   rs = pstmt.executeQuery();
   
   if(rs.next()) {
    balance = rs.getInt("BALANCE");
   }
   
  } catch (SQLException se) {
   se.printStackTrace();
  }
  
  return balance;
 }

 public void transfer(String sendAccount, String receiveAccount, int balance) {
  String sendSql = "UPDATE BANK SET BALANCE = BALANCE-? WHERE ACCOUNTNUMBER=?";

  String receiveSql = "UPDATE BANK SET BALANCE = BALANCE+? WHERE ACCOUNTNUMBER=?";
  
  int transferResult = 0;
  int count = 0;
  
  try {
   //보내는사람
   pstmt = con.prepareStatement(sendSql);
   pstmt.setInt(1, balance);
   pstmt.setString(2, sendAccount);
   pstmt.executeUpdate();
   
   //받는사람
   pstmt = con.prepareStatement(receiveSql);
   pstmt.setInt(1, balance);
   pstmt.setString(2, receiveAccount);
   transferResult = pstmt.executeUpdate();
   
   if(transferResult > 0) {
    pstmt = con.prepareStatement(sendSql);
    pstmt.setInt(1, balance);
    pstmt.setString(2, sendAccount);
    count = pstmt.executeUpdate();
    System.out.println("송금 성공!");
   }else{
    System.out.println("송금실패 ㅠㅠ");
   }
   
  } catch (SQLException se) {
    se.printStackTrace();
  }
 }
}