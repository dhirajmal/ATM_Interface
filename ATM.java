import java.util.Scanner;
class ATM1{
    float Balance=50000;
    int Setpin=123456;
    Scanner sc=new Scanner(System.in);
    public ATM1(){
        System.out.print("Enter pin:");
      int  pin=sc.nextInt();
        if(Setpin==pin){
            menu();
        }
        else
            System.out.println("Enter a valid pin");
    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. check A/c Balance");
        System.out.println("2. withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if (choice==1){
          checkBalance();
        }
        else if (choice==2) {
            withdrawMoney();
        }
        else if (choice==3) {
            depositMoney();
        }
        else if (choice==4){
            return;
        }
        else
            System.out.println("Enter a valid choise");
    }
    public void checkBalance(){
        System.out.println("your A/c Balance is:"+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.print("Enter Amount to withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if (Balance>=amount){
            Balance=Balance-amount;
            System.out.println("Money Withdrawl Successful");
        }
        else
            System.out.println("Insufficient Balance");
          menu();
    }
    public void depositMoney(){
        System.out.print("Enter Amount:");
        Scanner sc=new Scanner(System.in);
        float amountDeposit=sc.nextFloat();
        Balance=Balance+amountDeposit;
        System.out.println("Money Deposited Successfully");
       menu();
    }


}

public class ATM {

    public static void main(String[] args){

        ATM1 obj=new ATM1();

    }


}