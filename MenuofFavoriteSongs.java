import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;

public class MenuofFavoriteSongs {
public static Scanner scan = new Scanner (System.in);
    public static final String FILE_NAME = "data.txt";
    public static final String FILE_NAME1 = "lyric.txt";
    public static final String FILE_NAME2 = "lyric2.txt";
    public static final String FILE_NAME3 = "lyric3.txt";
    public static final String FILE_NAME4 = "lyric4.txt";
    public static final String FILE_NAME5 = "lyric5.txt";
    public static final String FILE_NAME6 = "lyric6.txt";
    public static final String FILE_NAME7 = "lyric7.txt";
    public static final String FILE_NAME8 = "lyric8.txt";
    public static final String FILE_NAME9 = "lyric9.txt";
    public static final String FILE_NAME10 = "lyric10.txt";
    public static final String FILE_NAME11 = "lyric11.txt";
    public static final String FILE_NAME12 = "lyric12.txt";
    public static final String FILE_NAME13 = "lyric13.txt";
    public static final String FILE_NAME14 = "lyric14.txt";
    public static final String FILE_NAME15 = "lyric15.txt";
    
    
    
    public static final String[][] USER_DATABASE = {
            {"BrentisBetter", "true"},
            
    };

     
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);

        // Login
        boolean loggedIn = false;
        String username, password, fullName = "";
        int attempts = 0;

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            loggedIn = authenticateUser(username, password);

            if (!loggedIn) {
                System.out.println("Invalid username or password. Please try again.");
                attempts++;

                if (attempts >= 3) {
                    System.out.println("Too many incorrect attempts. Exiting program.");
                    System.exit(0);
                }
            }
        } while (!loggedIn);

        
int user  = 0;
do {
         System.out.println("Reading data from file: Top Secret Documents");
        System.out.println();
        readDataFromFile();
      
       
        System.out.println();
        System.out.println("Enter your choice: ");
        user = scan.nextInt();
        System.out.println();


   switch (user)
   {
    case 1 : pools();
    break; 
    case 2 : reflect();
    break; 
    case 3 : stranger();
    break; 
    case 4 : beauty();
    break;
    case 5 : keeper();
    break; 
    case 6 : seeing();
    break; 
    case 7 : through();
    break; 
    case 8 : role();
    break;
    case 9 : she();
    break; 
    case 10 : lovely();
    break;
    case 11 : ready();
    break;
    case 12 : girl();
    break;
    case 13 : lemon();
    break;
    case 14 : with();
    break; 
    case 15 : first();
    break;
    case 16 : quit();
    break;
    default: System.out.println("Sorry you entered a Number that was not listed above, Try Again.");
    System.out.println();
    System.out.println();
   }
    System.out.println();
System.out.println();
   } while (user != 16);


}


    public static boolean authenticateUser(String username, String password) {
        for (String[] user : USER_DATABASE) {
            if (user[0].equals(username) && user[1].equals(password)) {
                
                return true;
            }
        }
       return false;
   }

    public static void readDataFromFile() {
        try {
            File file = new File(FILE_NAME);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME);
        }
    }
    
    

   
    
    
    //song lyrics
    public static void pools() throws FileNotFoundException{
    try {
            File file = new File(FILE_NAME1);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME1);
        }
    }
    
    
    
     public static void reflect() throws FileNotFoundException{
    try {
            File file = new File(FILE_NAME2);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME2);
        }
    
    
    }
    public static void stranger(){
    try {
            File file = new File(FILE_NAME3);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME3);
        }
    
    
    }
     public static void beauty(){
    try {
            File file = new File(FILE_NAME4);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME4);
        }
    
    
    }
    public static void keeper(){
    try {
            File file = new File(FILE_NAME5);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME5);
        }
    
    
    }
     public static void seeing(){
    try {
            File file = new File(FILE_NAME6);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME6);
        }
    
    
    }
    public static void through(){
    try {
            File file = new File(FILE_NAME7);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME7);
        }
    
    
    }
     public static void role(){
    try {
            File file = new File(FILE_NAME8);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME8);
        }
    
    
    }
    public static void she(){
    try {
            File file = new File(FILE_NAME9);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME9);
        }
    
    
    }
     public static void lovely(){
    try {
            File file = new File(FILE_NAME10);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME10);
        }
    
    
    }
    public static void ready(){
    
    try {
            File file = new File(FILE_NAME11);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME11);
        }
    
    }
    public static void girl(){
    try {
            File file = new File(FILE_NAME12);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME12);
        }
    
    
    }
     public static void lemon(){
    try {
            File file = new File(FILE_NAME13);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME13);
        }
    
    
    }
    public static void with(){
    try {
            File file = new File(FILE_NAME14);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME14);
        }
    
    
    }
     public static void first(){
    try {
            File file = new File(FILE_NAME15);
            Scanner fileScanner = new Scanner(file);

            System.out.println();

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME15);
        }
    
    
    }
    public static void quit(){
    
    System.out.println("You have Selected to End this Program");
    
    }
   
    
    
    
}
