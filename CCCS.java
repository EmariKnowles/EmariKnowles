import java.util.Scanner;

public class CCCS {

    public static final String USERNAME = "Jack1012";
    public static final String PASSWORD = "ilovetupac";

    public static void main(String args[]) {
        // Welcome message
        System.out.printf("%45s%n", "Caswell Catering and Convention Service");

        // Login
        if (login()) {
            displayFinalBill();
        } else {
            System.out.println("Access denied. Exiting Caswell Catering and Convention Service.");
        }
    }

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease log in to access Caswell Catering and Convention Service.");

        System.out.print("Enter your username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Enter your password: ");
        String passwordInput = scanner.nextLine();

        return USERNAME.equals(usernameInput) && PASSWORD.equals(passwordInput);
    }

 private static void displayFinalBill() {
        double ttr = .18;
double kidtoadult = .60;
System.out.printf("%45s" ,"Caswell Catering and Convention Service");
System.out.println();

System.out.printf("%30s" ,"Final Bill");
System.out.println();

System.out.println();
// Number of People
Scanner scan = new Scanner(System.in);
System.out.print("What is the number of people total?");
System.out.println();
double NOP = scan.nextDouble();
// Number of Adults
System.out.print("What is the number of Adults ?");
System.out.println();
double NOA = scan.nextDouble();

// Number of Children 
System.out.print("What is the number of Children ?");
System.out.println();
double NOC = scan.nextDouble();

// Cost per Adult without dessert 
System.out.print("What is the cost of an Adult meal?");
System.out.println();
double COAM = scan.nextDouble();

// Cost of Dessert 
System.out.print("What was the cost per dessert?");
System.out.println();
double COD = scan.nextDouble();

// Room Fee
System.out.print("What was the Room Fee if there was one?");
System.out.println();
double RF = scan.nextDouble();

// Tip and Tax Rate
System.out.print("What was the Tip/Tax rate?");
System.out.println();
double TTR = scan.nextDouble();
// Less Deposit 
System.out.print("What was your Deposit if you made one?");
System.out.println();
double LD = scan.nextDouble();






System.out.println();
System.out.printf("%60s","Caswell Catering and Convention Service");
System.out.println();
System.out.printf("%47s","Final Bill");
System.out.println();


// NOA
System.out.println();
System.out.printf("%31s","Number of Adults:");
System.out.printf("%26.0f", + NOA);

// NOC 
System.out.println();
System.out.printf("%31s","Number of Children:");
System.out.printf("%26.0f", + NOC);

// COAM
System.out.println();
System.out.print("Cost per adult without dessert:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", + COAM);

//COCM
System.out.println();
System.out.print("Cost per child without dessert:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", + COAM*kidtoadult);

//COD
System.out.println();
System.out.printf("%31s","Cost per dessert:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", + COD);

//Room fee
System.out.println();
System.out.printf("%31s"," Room fee:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", + RF);

//Tip and tax
System.out.println();
System.out.printf("%31s","Tip and tax rate:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", + ttr);





// TCOAM
System.out.println();
System.out.println(); 
System.out.printf("%31s","Total cost for Adult meals:");
System.out.printf("%12s","$");
System.out.printf("%14.2f", NOA*COAM);

// TCOCM
System.out.println(); 
System.out.printf("%31s","Total cost for Child meals:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f", COAM*kidtoadult*NOC);

// COD
System.out.println(); 
System.out.printf("%31s","Total cost for dessert:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f", NOP*COD );

// TCOCM
double tcocm;
tcocm = COAM*kidtoadult*NOC;
System.out.println(); 
System.out.printf("%31s","Total food cost:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f",(tcocm)+(NOA*COAM)+(COD*NOP) );

// PTT
System.out.println(); 
System.out.printf("%31s","Plus tip and tax:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f",((tcocm)+(NOA*COAM)+(COD*NOP))*(TTR) );

// PRF
System.out.println(); 
System.out.printf("%31s","Plus room fee:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f", RF);

// LD
System.out.println(); 
System.out.printf("%31s","Less Deposit:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f", -(LD) );

// Balance Due 
System.out.println(); 
System.out.println(); 
System.out.printf("%31s","Balance Due:");
System.out.printf("%12s","$" );
System.out.printf("%14.2f", ((tcocm)+(NOA*COAM)+(COD*NOP)) + ((tcocm)+(NOA*COAM)+(COD*NOP))*(TTR) + RF - (LD) );

    }






   }
