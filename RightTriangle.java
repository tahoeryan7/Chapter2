import java.util.Scanner;
// *******************************************************************
//   RightTriangle.java
//
//   Compute the length of the hypotenuse of a right triangle
//   given the lengths of the sides         
// *******************************************************************
 
public class RightTriangle
{
   public static void main (String[] args)
   {
          Scanner keyboard = new Scanner(System.in);
          double side1, side2;  // lengths of the sides of a right triangle
          double hypotenuse;        // length of the hypotenuse
 
          // Get the lengths of the sides as input
        System.out.print ("Please enter a length of the side of a right triangle");
        System.out.print ("Please enter a length of the side of a right triangle");

        side1 = keyboard.nextDouble();
        side2 = keyboard.nextDouble();
        
        hypotenuse = Math.pow(side1, 2) + Math.pow(side2, 2);
        hypotenuse = Math.sqrt(hypotenuse);
        
 
          // Compute the length of the hypotenuse
 
     
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
        }
}
