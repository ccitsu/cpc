package objectsNClasses.Employee;

import java.io.*;
public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("Nayyar Khan");
      Employee empTwo = new Employee("Mary Anne");
      Employee empThree = new Employee("Mark Anthony");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();

      empThree.empAge(41);
      empThree.empDesignation("Senior most Software Engineer");
      empThree.empSalary(1500);
      empThree.printEmployee();
   }
}