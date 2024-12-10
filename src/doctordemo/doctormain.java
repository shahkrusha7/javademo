package doctordemo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class doctormain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<doctor> doctors=new ArrayList<>();
        int option1=0;
        boolean found=false;
        doctor doctor=new doctor();

        do
        {
            System.out.println("\n\t Patient's Details");
            System.out.println("1. Entry");
            System.out.println("2. View");
            System.out.println("3. Search by Disease's Name:");
            System.out.println("4.  Exit");

            System.out.print("Enter Your option: ");
            option1=sc.nextInt();

            switch (option1)
            {
                case 1:
                    System.out.println("\n\t Patient's Entry ");
                    doctor.setdoctor();
                    doctors.add(doctor);
                break;

                case 2:
                    System.out.println("\n\t Patient View");
                    doctor.getdoctor();
                    System.out.println("----------------------------------");
                break;

                case 3:
                    System.out.println("\n\t Search by disease's name");
                    System.out.print("Enter disease name: ");
                    String searchdisease=sc.next();

                    for(doctor d:doctors)
                    {
                        for(patientdetails p:d.patients)
                            if(p.disease.equalsIgnoreCase(searchdisease))
                            {
                                d.getdoctor();
                                found=true;
                                break;
                            }
                    }
                    if(!found)
                        System.out.println("No record of mentioned disease found");
                break;

                case 4:
                    System.out.println("You are exited");
                break;

                default:
                    System.out.println("Wrong option selected try again");
                break;
            }
        }while (option1!=4);
    }
}
