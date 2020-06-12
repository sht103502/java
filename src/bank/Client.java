package bank;

public class Client {
 
 //필드
 private int clientNumber;
 private String name;
 private String accountNumber;
 private int balance;
 
 //getter,setter
 public int getClientNumber() {
  return clientNumber;
 }
 public void setClientNumber(int clientNumber) {
  this.clientNumber = clientNumber;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAccountNumber() {
  return accountNumber;
 }
 public void setAccountNumber(String accountNumber) {
  this.accountNumber = accountNumber;
 }
 public int getBalance() {
  return balance;
 }
 public void setBalance(int balance) {
  this.balance = balance;
 }
 
 //기본생성자
 public Client() {
 
 }
 
 //매개변수 생성자
 public Client(int clientNumber, String name, String accountNumber, int balance) {
  super();
  this.clientNumber = clientNumber;
  this.name = name;
  this.accountNumber = accountNumber;
  this.balance = balance;
 }
 
 //toString()
 @Override
 public String toString() {
  return "Client [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
    + ", balance=" + balance + "]";
 }
 
} 