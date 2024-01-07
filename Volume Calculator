import java.text.*;
import java.util.*;
import java.io.*;

public class Fair {
public static Scanner scan = new Scanner (System.in);

   public static void main (String args[]) {

 int user  = 0;
do {
   System.out.println("******************Emari's Volume Calculator******************");
   System.out.println("*************************************************************");
   System.out.println(" Select Which Shape that you would like to find the Volume of");
   System.out.println("*************************************************************");
   System.out.println("*           1:  Rectangular Solid             *");
   System.out.println("*           2:  Cube                          *");
   System.out.println("*           3:  Cylinder                      *");
   System.out.println("*           4:  Prism                         *");
   System.out.println("*           5:  Sphere                        *");
   System.out.println("*           6:  Pryamid                       *");
   System.out.println("*           7:  Right Circular Cone           *");
   System.out.println("*           8:  Square or Rectangular Pryamid *");
   System.out.println("*           9:  Ellipsoid                     *");
   System.out.println("*          10:  Tetrahedron                   *");
   System.out.println("*          11:  Select to Stop/Quit Program   *");
   System.out.println("*************************************************************");

 user = scan.nextInt();
   
     
   
   
   switch (user)
   {
    case 1 : rects();
   // System.out.println("*******Do you wish to proceed with the number " + scan.nextInt() + " ?*******");
    break; 
    case 2 : cube();
    break; 
    case 3 : cyl();
    break; 
    case 4 : prism();
    break;
    case 5 : sph();
    break; 
    case 6 : pry();
    break; 
    case 7 : right();
    break; 
    case 8 : squ();
    break;
    case 9 : elli();
    break; 
    case 10 : tet();
    break;
    case 11 : quit();
    break;
    default: System.out.println("Sorry you entered a Number that was not listed above, Try Again.");
    System.out.println();
    System.out.println();
   }
    System.out.println();
System.out.println();
   } while (user != 11);



 }//End Main
 
 
 
 public static void rects()
{

System.out.println("**********************Volume of a Rectangular Solid**************************");

System.out.println();
System.out.println();
formulaforRects();
System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program.");
System.out.println("To End Program When menu is Shown Enter in the Number 12.");

}



public static void cube()
{

System.out.println("Volume of a Cube");
System.out.println();
System.out.println();
VolumeofCube();
System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}

public static void cyl ()
{


 System.out.println("Volume of a Cylinder");
 System.out.println();
System.out.println();
 VolumeofCylinder();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}
public static void prism ()
{


 System.out.println("Volume of a Prism");
 System.out.println();
System.out.println();
 VolumeofPrism();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}

public static void sph ()
{


 System.out.println(" Volume of a Sphere");
 System.out.println();
System.out.println();
 VolumeofSphere();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}

 public static void pry ()
{


 System.out.println(" Volume of a Pryamid");
 System.out.println();
System.out.println();
 VolumeofPryamid();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}
 
public static void right ()
{


 System.out.println("Volume of a Right Circular Cone");
 System.out.println();
System.out.println();
 VolumeofRightCircularCone();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}

public static void squ ()
{

System.out.println(" Volume of a Square or Rectangle Pryamid");
System.out.println();
System.out.println();
VolumeofSquareorRectanglePryamid();
System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}

public static void elli ()
{


 System.out.println("Volume of a Ellipoid");
 System.out.println();
System.out.println();
 VolumeofEllipoid();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}
 
 public static void tet ()
{


 System.out.println("Volume of a Tetrahedron");
 System.out.println();
System.out.println();
 VolumeofTetradron();
 System.out.println("This Program will run until you have Enter the Following Number that Corresponds with ending this Program");
System.out.println("To End Program When menu is Shown Enter in the Number 12");
}
 
 public static void quit ()
{


 System.out.println("You have Selected to End this Program");
}
 
 

 
 
 
 //Rectangle
 public static void formulaforRects() {
  double A = 0;
 //System.out.println("*******Do you wish to proceed with the number " + scan.nextInt() + " ?*******");
 System.out.println("The formula for finding the volume of a Rectangle is --> Length * Width * Height = Volume of a Rectangle");
 System.out.println();
 System.out.println();
 System.out.println("Enter the Length of the Rectangle");
 
 double userMathIn1 = scan.nextDouble();
 System.out.println("Enter the Width of the Rectangle");
 double userMathIn2 = scan.nextDouble();
 System.out.println("Enter the Height of the Rectangle");
 double userInH = scan.nextDouble();
 A =(userMathIn1)*(userMathIn2)*userInH;
 System.out.println("For the values you entered the Volume of the Rectangle is " + A);
 
System.out.println();
System.out.println();
System.out.println();
System.out.println();
 }

//Cube
 public static void VolumeofCube() {
 double S = 0;
 System.out.println("The formula for finding the volume of a Cube is --> A^3 = Volume of a Cube");
 System.out.println();
System.out.println();
 System.out.println("Enter your A Value");
 double userMathInr = scan.nextDouble();
 S = Math.pow(userMathInr,3);
 System.out.println("For the values you entered the Volume of the Cube is " + S);
System.out.println();
System.out.println();
 }
//Cylinder
public static void VolumeofCylinder() {
 double C = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Cylinder is --> Pie * Radius^2 * Height = Volume of a Cylinder");
 System.out.println();
System.out.println();
 System.out.println("Enter your Radius value");
 double userMathInr2 = scan.nextDouble();
 System.out.println("Enter your Height value");
 double userMathInH = scan.nextDouble();
 C = pie *Math.pow(userMathInr2,2)*userMathInH;
 System.out.println("For the values you entered the Volume of a Cylinder is " + C);
System.out.println();
System.out.println();
}


public static void VolumeofPrism() {
 double P = 0;
 System.out.println("The formula for finding the volume of a Prism is --> Base * Height = Volume of a Prism");
 System.out.println();
System.out.println();
 System.out.println("Enter the Area of your Base value");
 double userMathInrB = scan.nextDouble();
 System.out.println("Enter the Height value");
 double userMathInrH = scan.nextDouble();
 P = (userMathInrB)*(userMathInrH);
 System.out.println();
 System.out.println("For the values you entered the Volume of the Prism is " + P);
System.out.println();
System.out.println();

}


public static void VolumeofSphere() {
 double S = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Sphere is --> (4/3) * Pie * Radius^3 = Volume of a Sphere");
 System.out.println();
System.out.println();
 System.out.println("Enter the Radius value");
 double userMathInrB = scan.nextDouble();
 S = (4/3) * pie* Math.pow(userMathInrB,3);
 System.out.println("For the values you entered the Volume of the Sphere is " + S);
System.out.println();
System.out.println();

}


public static void VolumeofPryamid() {
double Pr = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Pryamid is --> (1/3) * Base * Height = Volume of a Pryamid");
 System.out.println();
System.out.println();
 System.out.println("Enter the Area of the Base value");
 double userMathInrB = scan.nextDouble();
 System.out.println("Enter the Height value");
 double userMathInrH = scan.nextDouble();
 Pr = (1/3) * userMathInrB*userMathInrH;
 System.out.println("For the values you entered the Volume of the Pryamid is " + Pr);
System.out.println();
System.out.println();

}


public static void VolumeofRightCircularCone() {
double S = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Right Circular Cone is --> (1/3) * Pie * Radius^2 * Height = Volume of a Right Circular Cone ");
 System.out.println();
System.out.println();
 System.out.println("Enter the Radius value");
 double userMathInrB = scan.nextDouble();
 System.out.println("Enter the Height value");
 double userMathInrH = scan.nextDouble();
 S = (1/3) * pie* Math.pow(userMathInrB,2)* userMathInrH;
 System.out.println("For the values you entered the Volume of the Right Circular Cone is " + S);
System.out.println();
System.out.println();

}


public static void VolumeofSquareorRectanglePryamid() {

double SP = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Square or Rectangular Pryamid is --> (1/3) * Length * Width * Height = Volume of a Square or Rectangular Pryamid ");
 System.out.println();
System.out.println();
 System.out.println("Enter the Length value");
 double userMathInrL = scan.nextDouble();
 System.out.println("Enter the Width value");
 double userMathInrW = scan.nextDouble();
 System.out.println("Enter the Height value");
 double userMathInrH = scan.nextDouble();
 SP = (1/3) * userMathInrL * userMathInrW * userMathInrH;
 System.out.println("For the values you entered the Volume of the Square or Rectangular Pryamid is " + SP);
System.out.println();

}


public static void VolumeofEllipoid() {
double El = 0;
 double pie = 3.14;
 System.out.println("The formula for finding the volume of a Ellipoid is --> (4/3) * Pie * Semi-Axes (A*B*C) = Volume of a Ellipoid");
 System.out.println();
System.out.println();
 System.out.println("Enter the A value");
 double userMathInrA = scan.nextDouble();
 System.out.println("Enter the B value");
 double userMathInrB = scan.nextDouble();
 System.out.println("Enter the C value");
 double userMathInrC = scan.nextDouble();
 El = (4/3) *pie * userMathInrA * userMathInrB * userMathInrC;
 System.out.println("For the values you entered the Volume of the Ellipoid is " + El);
System.out.println();

}


public static void VolumeofTetradron(){
double tet = 0;
 double pie = 3.14;
 int two = 2;
 System.out.println("The formula for finding the volume of a Tetradron is --> A^3 / (6 sqrt 2)= Volume of a Tetradron");
 System.out.println();
System.out.println();
 System.out.println("Enter the A value");
 double userMathInrA = scan.nextDouble();
 System.out.println();
System.out.println();
 tet = Math.pow(userMathInrA,3) / 6 * Math.sqrt(two);
 System.out.println("For the values you entered the Volume of the Tetradron is " + tet);
 System.out.println();
System.out.println();
System.out.println();

}











}// End Class

// all math right make menu
