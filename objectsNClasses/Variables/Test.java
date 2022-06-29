package objectsNClasses.Variables;

import java.io.*;
public class Test {

   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Software Engineering";

   public static void main(String args[]) {
      salary = 10000;
      System.out.println(DEPARTMENT + " average salary:" + salary);
   }
}