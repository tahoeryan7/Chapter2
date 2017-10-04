// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
         //this will put the two strings together and not create an error 
                                 "concatenation of two shorter strings.");               
                //the next line will add the 55 next to the about
         System.out.println ("The first computer was invented about" + 55 +
         // the years will be right next to the 55 with no space
                                 "years ago.");
         System.out.println ("8 plus 5 is " + 8 + 5);
         // the 8+5 will make 85 because it is putting two numbers together not adding 
         System.out.println ("8 plus 5 is " + (8 + 5));
         //the (8+5) will make 13 because it's adding the two numbers together
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //the last line makes 13 by adding the 8+5 and then says it equals 8 plus 5
        }
}