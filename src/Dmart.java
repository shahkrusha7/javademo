import java.util.ArrayList;
import java.util.Scanner;

public class Dmart
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<vendor> vendors=new ArrayList<>();
        ArrayList<customer> customers=new ArrayList<>();
        int option1=0,option2=0;
        boolean found=false;

        do
        {
            System.out.println("\n\t Dmart \n");
            System.out.println("1. Purchase");
            System.out.println("2. Sales");
            System.out.println("3. Exit");

            System.out.print("Enter your option: ");
            option1=sc.nextInt();

            switch (option1)
            {
                case 1:
                    do
                    {
                        System.out.println("\n\t Purchase\n");
                        System.out.println("1. Entry");
                        System.out.println("2. view");
                        System.out.println("3. Search by Bill number");
                        System.out.println("4. Search by Product Name");
                        System.out.println("5. Delete by Bill number");
                        System.out.println("6. Update by Bill number");
                        System.out.println("7. Main Menu");

                        System.out.print("Enter your option: ");
                        option2=sc.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="y";
                                do
                                {
                                    System.out.println("\n\t Purchase Entry\n");
                                    vendor vendor=new vendor();
                                    vendor.setvendor();
                                    vendors.add(vendor);
                                    System.out.print("Do you want to add another bill? (y/n): ");
                                    option3=sc.next();
                                }while (option3.equalsIgnoreCase("y"));
                            break;

                            case 2:
                                System.out.println("\n\t Purchase View\n");

                                for(vendor v:vendors)
                                {
                                    v.getvendor();
                                    System.out.println("---------------------------");
                                }
                            break;

                            case 3:
                                System.out.println("\n\t Search by Bill Number");
                                System.out.print("Enter Bill number: ");
                                int searchbillno=sc.nextInt();


                                for(vendor v:vendors)
                                {
                                    if (v.billno==searchbillno)
                                    {
                                        v.getvendor();
                                        found=true;
                                        break;
                                    }
                                }
                                if(!found)
                                    System.out.println("No record found for bill number "+searchbillno);
                            break;

                            case 4:
                                System.out.println("\n\t Search by Product Name");
                                System.out.println("Enter Product Name: ");
                                String searchProductName = sc.next();

                                boolean productFound = false;
                                for (vendor v : vendors)
                                {
                                    for (productdetail p : v.products)
                                    {
                                        if (p.name.equalsIgnoreCase(searchProductName))
                                        {
                                            v.getvendor();
                                            productFound = true;
                                            break;
                                        }
                                    }
                                }
                                if (!productFound) System.out.println("No product found with name: " + searchProductName);
                            break;

                            case 5:
                                System.out.println("\n\tDelete by Bill No");
                                System.out.println("Enter Bill Number to Delete: ");
                                int deleteBillNo = sc.nextInt();

                                for (int i = 0; i < vendors.size(); i++)
                                {
                                    if (vendors.get(i).billno == deleteBillNo)
                                    {
                                        vendors.remove(i);
                                        System.out.println("Record deleted successfully.");
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) System.out.println("No record found for Bill No: " + deleteBillNo);
                            break;

                            case 6:
                                System.out.println("\n\tUpdate by Bill Number");
                                System.out.println("Enter Bill Number to Update: ");
                                int updateBillNo = sc.nextInt();

                                for (vendor v : vendors)
                                {
                                    if (v.billno == updateBillNo)
                                    {
                                        v.setvendor();
                                        System.out.println("Record updated successfully.");
                                        break;
                                    }
                                }
                            break;


                            case 7:
                                System.out.println("\n\tBack to main menu\n");
                            break;

                            default:
                                System.out.println("Wrong option selected try again!!");
                            break;
                        }
                    }while (option2!=7);
                break;

                case 2:
                    do
                    {
                        System.out.println("\n\t Sales\n");
                        System.out.println("1. Entry");
                        System.out.println("2. View");
                        System.out.println("3. Search by bill number");
                        System.out.println("4. Search by Product Name");
                        System.out.println("5. Delete by Bill number");
                        System.out.println("6. Update by Bill number");
                        System.out.println("7. Main Menu");

                        System.out.print("Enter your option: ");
                        option2=sc.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="y";
                                do
                                {
                                    System.out.println("\n\t Sales Entry\n");

                                    customer customer=new customer();
                                    customer.setcustomer();
                                    customers.add(customer);
                                    System.out.print("Do you want to add another bill? (y/n): ");
                                    option3=sc.next();
                                }while (option3.equalsIgnoreCase("y"));
                            break;

                            case 2:
                                System.out.println("\n\t Sales View\n");
                                for(customer c:customers)
                                {
                                    c.getcustomer();
                                    System.out.println("--------------------------");
                                }
                            break;

                            case 3:
                                System.out.println("\n\t Search by Bill Number");
                                System.out.print("Enter Bill number: ");
                                int searchbillno=sc.nextInt();

                                for(customer c:customers)
                                {
                                    if (c.billno==searchbillno)
                                    {
                                        c.getcustomer();
                                        found=true;
                                        break;
                                    }
                                }
                                if(!found)
                                    System.out.println("No record found for bill number "+searchbillno);
                            break;

                            case 4:
                                System.out.println("\n\t Search by Product Name");
                                System.out.println("Enter Product Name to Search: ");
                                String searchProductName = sc.next();

                                boolean productFound = false;
                                for (customer c : customers)
                                {
                                    for (productdetail p : c.products)
                                    {
                                        if (p.name.equalsIgnoreCase(searchProductName))
                                        {
                                            System.out.println("Product found in Bill No: " + c.billno);
                                            c.getcustomer();
                                            productFound = true;
                                            break;
                                        }
                                    }
                                }
                                if (!productFound) System.out.println("No product found with the name: " + searchProductName);
                            break;

                            case 5:
                                System.out.println("\n\tDelete by Bill No");
                                System.out.println("Enter Bill Number to Delete: ");
                                int deleteBillNoSales = sc.nextInt();

                                boolean foundSales = false;
                                for (int i = 0; i < customers.size(); i++) {
                                    if (customers.get(i).billno == deleteBillNoSales) {
                                        customers.remove(i);
                                        System.out.println("Sales record deleted successfully.");
                                        foundSales = true;
                                        break;
                                    }
                                }
                                if (!foundSales) System.out.println("No Sales record found for Bill No: " + deleteBillNoSales);
                            break;

                            case 6:
                                System.out.println("\n\t Update by Bill Number");
                                System.out.println("Enter Bill Number to Update: ");
                                int updateBillNo = sc.nextInt();

                                boolean foundUpdate = false;
                                for (customer c : customers)
                                {
                                    if (c.billno == updateBillNo)
                                    {
                                        System.out.println("Updating details for Bill No: " + updateBillNo);
                                        c.setcustomer();
                                        System.out.println("Sales record updated successfully.");
                                        foundUpdate = true;
                                        break;
                                    }
                                }
                                if (!foundUpdate) System.out.println("No Sales record found for Bill No: " + updateBillNo);
                            break;

                            case 7:
                                System.out.println("\n\t Back to main menu\n");
                            break;

                            default:
                                System.out.println("Wrong option selected try again!!");
                            break;
                        }
                    }while (option2!=7);
                break;

                case 3:
                    System.out.println("You are exited");
                break;

                default:
                    System.out.println("Wrong option selected try again!!");
                break;
            }
        }while (option1!=3);
    }
}
