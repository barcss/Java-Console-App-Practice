import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable declarations
        String CustomerName, ProductDescription;
        int MembershipStatus, ProductCode, OrderQuantity, StockAvailable, DiscountEligibility, MembershipPoints;
        double TotalPrice, AmountTendered, ProductPrice;
        Scanner scan = new Scanner(System.in);

        System.out.println("|=|=|=|=|=|=|=|=|=|>> WELCOME TO QUEUE MART <<|=|=|=|=|=|=|=|=|=|");
        System.out.println(" |=|=|=|=|=|=|=|=|=|=|>> OWNED BY GROUP 6 <<|=|=|=|=|=|=|=|=|=|=|\n");

        //Inputs
        System.out.print("Enter Customer Name: ");
        CustomerName = scan.nextLine();
        System.out.print("Enter Membership Status (1 = member, 0 = non-member): ");
        MembershipStatus = scan.nextInt();
        System.out.print("Enter Current Membership Points: ");
        MembershipPoints = scan.nextInt();
        if (MembershipPoints <= -1) {
            System.out.println("\nInvalid input. Program Terminated");
            System.exit(0);
        }
        System.out.print("Enter Product Code: ");
        ProductCode = scan.nextInt();
        scan.nextLine(); //consume the \n when hitting enter in ProductCode input so it won't be stored in ProductDescription
        System.out.print("Enter Product Description: ");
        ProductDescription = scan.nextLine();
        System.out.print("Enter Product Price: ");
        ProductPrice = scan.nextInt();
        if (ProductPrice <= 0) {
            System.out.println("\nInvalid input. Program Terminated");
            System.exit(0);
        }
        System.out.print("Enter Quantity: ");
        OrderQuantity = scan.nextInt();
        if (OrderQuantity <= 0) {
            System.out.println("\nInvalid input. Program Terminated");
            System.exit(0);
        }
        System.out.print("Enter Stock Available: ");
        StockAvailable = scan.nextInt();
        if (StockAvailable <= 0) {
            System.out.println("\nInvalid input. Program Terminated");
            System.exit(0);
        }
        System.out.print("Eligible for Discount (1 = yes, 0 = no): ");
        DiscountEligibility = scan.nextInt();
        System.out.print("Amount Tendered: ");
        AmountTendered = scan.nextInt();

        // Outputs
        System.out.println("\n[=][=][=][=][=][=][=] TRANSACTION COMPLETED [=][=][=][=][=][=][=]\n");
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("New Product Code: " + (ProductCode << 2)); //Left shift ProductCode by 2 bits
        System.out.println("Product Description: " + ProductDescription);
        System.out.println("Total Price (before discount): " + (TotalPrice = (OrderQuantity * ProductPrice))); //Stored value to TotalPrice for future reference
        if (DiscountEligibility == 1) System.out.println("Total Price (after discount): " + (TotalPrice = TotalPrice * 0.8)); //Stored value to TotalPrice for future reference
        else System.out.println("Total Price (after discount): " + TotalPrice); //Same value as before discount if not eligible for discount
        System.out.println("Stocks Remaining: " + (StockAvailable - OrderQuantity)); //Used arithmetic instead of unary
        System.out.println("Discount Flag ^ Membership Flag: " + (DiscountEligibility ^ MembershipStatus)); // Bitwise XOR
        System.out.println("Total Membership Points: " + (++MembershipPoints)); //Pre-increment
        System.out.println("Total Points && Total Price: " + ((MembershipPoints >= 100) && (TotalPrice >= 100))); //Comparison and Logical
        System.out.println("\nAmount Tendered: " + AmountTendered);
        System.out.println("Change: PHP " + (AmountTendered - TotalPrice)); //Deduct total price from amount tendered

        System.out.println("\n[=][=][=][=][=] Thank you for buying at QUEUE Mart! [=][=][=][=][=]\n");

    }
}

/*
Leader: Barcinilla, John Paul
Members:
    Manuel, Allan Cedric
    Aguas, Albert
    Santos, Jose
    Ciervo, Catherine
    Miro, Niel
    Tangtang, Monique
 */