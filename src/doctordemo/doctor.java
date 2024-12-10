package doctordemo;

import java.util.ArrayList;
import java.util.Scanner;

public class doctor extends patientdetails
{
    String docname;
    int fees;

    ArrayList<patientdetails> patients=new ArrayList<>();

    void setdoctor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Doctor's Name: ");
        docname=sc.next();
        System.out.print("Enter Consultancy Fees: ");
        fees=sc.nextInt();

        String option="y";
        do
        {
            patientdetails patient =new patientdetails();
            patient.setpatientdetails();
            System.out.print("Do you want to add another patient? (y/n): ");
            option=sc.next();
            patients.add(patient);
        }while (option.equalsIgnoreCase("y"));
    }

    void getdoctor()
    {
        System.out.println("Doctor's Name: "+docname);
        System.out.println("Consultancy Fees: "+fees);

        for(patientdetails patient:patients)
        {
            patient.getpatientdetails();
        }
    }
}
