package BasicOperators;
public class Ternary {

    public static void main(String args[]) {
       int a, b;
       a = 10;
       // Ternary Operator!
       b = (a == 1) ? 20: 30;

//    Variable = Condition ? Option 1 : Option 2 
       /*if (a==1)
       {
         b = 20;
       }
       else {
         b = 30;
       }
       */

       System.out.println( "Value of b is : " +  b );
 
       b = (a == 10) ? 20: 30;
       System.out.println( "Value of b is : " + b );

       String name = "James";

      // following will return true since name is type of String
      boolean result = name instanceof String;
      System.out.println( result );
    }
 }
