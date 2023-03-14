// Write classes code here
class Account{
   protected double balance;
   public void Withdraw(double amount){

   }
   public void Deposit(double amount){

   }
   public void printBalance(){

   }
}
class Saving extends Account{
   private double interestRate = 0.8;
   private double balance;
   public Saving(double balance) {        //Constructor for the class
      super.balance = balance;      // setting the balance of the member
   }

   public void Withdraw(double amount){
      super.balance = super.balance - (amount + amount * interestRate);
   }

   public void Deposit(double amount){
      super.balance = super.balance + (amount + amount * interestRate);
   }

   public void printBalance(){
      System.out.println("Balance in your Saving account:" + super.balance);
   }
}
class Current extends Account{
   private double interestRate = 0.8;
   public Current(double balance) {       //Constructor for the class
      super.balance = balance;             // setting the balance of the member
   }
   public void Withdraw(double amount){
      super.balance = super.balance - amount;
   }

   public void Deposit(double amount){
      super.balance = super.balance + amount;
   }

   public void printBalance(){
      System.out.println("Balance in your Current account:" + super.balance);
   }
}
class Test {

   public static void main(String args[]) {
      // make instances of classes here
      Account[] member = new Account[2];
      member[0] = new Saving(50000);
      member[1] = new Current(50000);
      // call their traits functions here
      member[0].printBalance();
      member[0].Deposit(1000);
      member[0].printBalance();
      member[0].Withdraw(3000);
      member[0].printBalance();
      System.out.println();
      member[1].printBalance();
      member[1].Deposit(1000);
      member[1].printBalance();
      member[1].Withdraw(3000);
      member[1].printBalance();
   }

}
