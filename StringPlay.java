 
// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
          String college = new String ("PoDunk College");
          String Town = new String ("Anytown, USA"); // part (a)
                  
          int stringLength;
          String change1, change2, change3;
 
          stringLength = college.length(); // part (b)
 
          System.out.println (college + " contains " + stringLength + " characters.");
          change1 = college.toUpperCase(); // part (c)
          System.out.println(change1);
          change2 = college.replaceAll("o", "*"); // part (d)
          System.out.println(change2);
          change3 = college + "  " + Town; // part (e)
          System.out.println(change3);
          System.out.println ("The final string is " + change3);
        }
}