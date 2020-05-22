/*
  Date : 2020.05.19(수정)
  Author : 이유진, 신희태, 김성진, 이영은
  Description : 2030 미용실(switch Example)
  Version : 1.0
*/
package java0512;

import java.util.Scanner;

public class ex_example {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num ;
  int num1;
  int sum=0;
  int price = 0;
  double avg =0;

  String name ="";
  
  System.out.println("2030미용실에 오신 것을 환영합니다.");
  System.out.println("어떻게  도와 드릴까요?.\n");  //   \n = 한줄 띄움
  
  System.out.println("1. 유진쌤 \t\t2. 영은쌤");  //   \t\t 간격 띄우기(tap)
  System.out.println("3. 희태쌤 \t\t4. 성진쌤");
  
  System.out.println("원하는 쌤을 지명하세요. >>> ");
  num1 = sc.nextInt();
  
  System.out.println("1. 컷트\t\t2. 펌\t\t3. 염색\t\t");  
  System.out.println("4. 클리닉\t\t5. 헤드스파\t6. 선택없음");
  
  System.out.println("메뉴를 선택해 주세요. >>> ");
  
  int cho[] =new int [3];
  String[] menu =new String[3];
  for(int i=0; i<cho.length;i++) {
	  num=sc.nextInt();
	
	  
  
  switch(num) {
  case 1 :
   menu[i]  = "컷트";
   price = 15000;
   break;
  case 2 :
   menu[i]  = "펌";
   price = 100000;
   break;
  case 3 :
   menu[i] = "염색";
   price = 70000;
   break;
  case 4 :
   menu[i] = "클리닉";
   price = 80000;
   break;
  case 5 :
   menu[i] = "헤드스파";
   price = 50000;
   break;
  case 6 :
	  menu[i] = "선택없음";
	  price =0;
	  break;
  default:
   
   System.out.println("해당 메뉴는 없습니다.");
  }
   //
  
  cho[i] =num;
  sum+=price;
  avg = sum*0.7; 
  }
  switch(num1) {
  case 1 :
   name ="유진쌤";
   break;
  case 2 :
   name = "영은쌤";
   break;
  case 3 :
   name= "희태쌤";
   break;
  case 4 :
   name = "성진쌤";
   
   break;
  default:
   System.out.println("해당 쌤는 없습니다.");
  }
    
 if(num1>=1&&num1<=4)

 

 {
  System.out.println("선택하신 선생님은  "+ name + "입니다.");
  System.out.print("선택하신 메뉴는 ");
  for(int i=0; i<menu.length; i++) {
	  System.out.print(menu[i]+" ");
  }System.out.println();
  System.out.println("가격은 " + sum + "원입니다.");
  System.out.println("30% 할인 들어간 금액은" + (int)avg + "원 입니다.");
 }System.out.println("이용해 주셔서 감사합니다.");
}}
 