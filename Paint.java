//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length =15;
            int width =11;
            int height =8;
            //declare double totalSqFt
            double totalSqFt=(length*width+(4*width*height));
            //declare double paintNeeded;
            double paintNeeded = totalSqFt/COVERAGE; 
            //Declare and initialize the length of the room
            length= 15;
            //Declare and initialize the width of the room
            width= 11;
            //Declare and initialize the height of the room
            height= 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            //done above
            //Compute the amount of paint needed
       
            int gallons = (int) paintNeeded +1;
            
            System.out.println("length =" + length);
            System.out.println("Width =" + width);
            System.out.println("Height =" + height);
            System.out.println("Gallons Needed =" + gallons);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
        }
}