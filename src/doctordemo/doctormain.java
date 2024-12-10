package doctordemo;

import java.util.Scanner;

public class doctormain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int option1=0;
        doctor doctors=new doctor();

        do
        {
            System.out.println("\n\t Patient's Details");
            System.out.println("1. Entry");
            System.out.println("2. View");
            System.out.println("3.  Exit");

            System.out.print("Enter Your option: ");
            option1=sc.nextInt();

            switch (option1)
            {
                case 1:
                    System.out.println("\n\t Patient's Entry ");
                    doctors.setdoctor();
                break;

                case 2:
                    System.out.println("\n\t Patient View");
                    doctors.getdoctor();
                break;

                case 3:
                    System.out.println("You are exited");
                break;

                default:
                    System.out.println("Wrong option selected try again");
                break;
            }
        }while (option1!=3);
    }
}
