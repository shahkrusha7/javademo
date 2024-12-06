import java.util.Scanner;

public class personaldetails
{
    int id;
    String name,phoneno,address;

    void setpersonaldetails(String title)
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter ID: ");
            id= sc.nextInt();
        }while (!validation.ispositive(id));
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Phone Number: ");
        phoneno= sc.next();
        System.out.print("Enter Address: ");
        address=sc.next();
    }

    void getpersonaldetails(String title)
    {
        System.out.println(title+" ID : "+id);
        System.out.println(title+" Name : "+name);
        System.out.println(title+" Phone Number : "+phoneno);
        System.out.println(title+" Address : "+address);
    }

}
