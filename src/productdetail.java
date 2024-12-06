import java.util.Scanner;

public class productdetail
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

    void setproductdetail()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter product ID:");
            id=sc.nextInt();
        }while (!validation.ispositive(id));
        System.out.print("Enter product Name:");
        name=sc.next();
        do
        {
            System.out.print("Enter product qty:");
            qty=sc.nextInt();
        }while (!validation.ispositive(qty));
        System.out.print("Enter product rate:");
        rate=sc.nextFloat();
        price=qty*rate;
    }

    void getproductdetail()
    {
        System.out.println(id+"\t"+name+"\t"+qty+"\t"+rate+"\t"+price);
    }
}
