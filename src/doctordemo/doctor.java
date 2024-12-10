package doctordemo;

import java.util.ArrayList;
import java.util.Scanner;

public class doctor extends patientdetails
{
    String docname;
    int fees;

    //ArrayList<patientdetails> patients=new ArrayList<>();

    void setdoctor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Doctor's Name: ");
        docname=sc.next();
        setpatientdetails();
        System.out.print("Enter Consultancy Fees: ");
        fees=sc.nextInt();
    }

    void getdoctor()
    {
        System.out.println("Doctor's Name: "+docname);
        getpatientdetails();
        System.out.println("Consultancy Fees: "+fees);
    }
}
