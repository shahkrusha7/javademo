import java.util.ArrayList;
import java.util.Scanner;

public class customer extends personaldetails
{
    int billno;
    String billdate;
    float totalamt,discount,tax,billamt;

    ArrayList<productdetail> products=new ArrayList<>();

    void setcustomer()
    {
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.print("Enter Bill Number: ");
            billno= sc.nextInt();
        }while (!validation.ispositive(billno));
        System.out.print("Enter Bill Date :");
        billdate=sc.next();

        setpersonaldetails("customer");

        String option="y";
        do
        {
            productdetail product=new productdetail();
            product.setproductdetail();
            totalamt=totalamt+product.price;
            System.out.print("Do you want to add another bill ? (y/n):");
            option=sc.next();
            products.add(product);

        }while (option.equalsIgnoreCase("y"));


        System.out.println("Enter Discount: ");
        discount=sc.nextFloat();
        discount=(discount*totalamt)/100;
        System.out.println("Enter Tax: ");
        tax=sc.nextInt();
        tax=(tax*totalamt)/100;
        billamt=billamt+tax-discount;

    }

    void getcustomer()
    {
        System.out.println("Bill No: "+billno);
        System.out.println("Bill Date: "+billdate);

        getpersonaldetails("customer");
        System.out.println("ID \t Name \t Qty \t Rate \t Price\n");
        System.out.println("--------------------------------------");

        for(productdetail product:products)
        {
            product.getproductdetail();
        }

        System.out.println("Total Amount: "+totalamt);
        System.out.println("Discount: "+discount);
        System.out.println("Tax: "+tax);
        System.out.println("Bill Amount: "+billamt);
    }
}
