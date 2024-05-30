import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        long Balance = 0;
        while(true)
        {
            System.out.println("\nBalance : "+ Balance);
            System.out.println("\nATM Machine");
            System.out.println("choose 1 for Withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for EXIT");
            System.out.print("choose the operation : ");
            long a = sc.nextLong();
            if(a==1)
            {
                System.out.print("Enter money to withdraw : ");
                long c = sc.nextLong();
                if(Balance>=c)
                {
                    Balance-=c;
                    System.out.println("Your Money has been withdrew Successfully");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
            }
            else if(a==2)
            {
                System.out.print("Enter money to be deposited : ");
                long b = sc.nextLong();
                Balance+=b;
                System.out.println("Your Money has been Successfully deposited ");
            }
            else if(a==3)
            {
                System.out.println("Balance : "+Balance);
            }
            else if(a==4)
            {
                System.out.println("Thank you!");
                System.out.println("Please remove your card");
                break;
            }
            else
            {
                System.out.print("Invalid option,Please enter valid option");
            }
        }
    }
}
