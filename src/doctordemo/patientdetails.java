package doctordemo;

import java.util.Scanner;

public class patientdetails
{
    String fullname;
    int age;
    String sex;
    String address;
    int phoneno;
    String disease;
    String date;

    void setpatientdetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Patient's Full Name: ");
        fullname=sc.next();
        System.out.print("Enter Patient's Age: ");
        age=sc.nextInt();
        System.out.print("Enter Patient's Sex: ");
        sex=sc.next();
        System.out.print("Enter Patient's Address: ");
        address=sc.next();
        System.out.print("Enter Patient's Phone Number: ");
        phoneno=sc.nextInt();
        System.out.print("Enter Patient's Disease: ");
        disease=sc.next();
        System.out.print("Enter Date: ");
        date=sc.next();
    }

    void getpatientdetails()
    {
        System.out.println("Full Name: "+fullname);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+phoneno);
        System.out.println("Disease: "+disease);
        System.out.println("Date: "+date);
    }
}
