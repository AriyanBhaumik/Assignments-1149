package Assignment1;

import java.util.*;
class BankAcct
{
    private String accno;
    private double balance;
    private double rate;
    Scanner in=new Scanner(System.in);
    public BankAcct()
    {
        accno="";
        balance=0.0;
        rate=8.0;
    }
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        this.accno=in.next();  
        System.out.print("Enter Balance: ");  
        balance=in.nextDouble();  
    }  
     public void showAccount() {  
        System.out.println("Account no.: " + accno);  
        System.out.println("Balance: " + balance);  
    }  
    public void viewRate()
    {
        System.out.println("The rate of interest is : "+rate);
    }
    public void changeRate()
    {
        System.out.println("Enter new value of interest rate : ");
        rate=in.nextDouble();
    }
    public void calcInterest()
    {
        System.out.println("Enter time constraint : ");
        double time=in.nextDouble();
        double interest=(balance*rate*time)/100;
        System.out.println("Interest earned= "+interest);
        balance+=interest;
    }
    public boolean search(String ac_no)
    {  
        if (accno.equals(ac_no)){
            showAccount();
            return true;
        }
        return false;  
    }  
}

public class BankingApp {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankAcct C[] = new BankAcct[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankAcct();  
            C[i].openAccount();  
        }  
        BankAcct ob=new BankAcct();
        // loop runs until number 5 is not pressed to exit  
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Show Interest earned \n 4. Change interest rate \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch)
                {
                    case 1:
                        for(int i=0;i<C.length;i++)
                        {
                            C[i].showAccount();
                        }
                        break;
                    case 2:
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:
                        for(int i=0;i<C.length;i++)
                        {
                            C[i].calcInterest();
                        }
                        break;
                    case 4:
                        ob.changeRate();
                        ob.viewRate();
                        break;
                    case 5:
                        System.out.println("Thanks for using this Application.");
                        break;
                }
        } while(ch!=5);
    }
}