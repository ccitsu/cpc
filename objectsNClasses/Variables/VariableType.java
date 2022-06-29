package objectsNClasses.Variables;

public class VariableType {
    public void pupAge() {
       int age = 0;
       age = age + 7;
       System.out.println("Puppy age is : " + age);
    }
 
    public static void main(String args[]) {
       VariableType test = new VariableType();
       test.pupAge();
    }
 }

 // ERRORENOUS CODE! 
 /*
  * public class Test {
   public void pupAge() {
      int age;
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.pupAge();
   }
}
  */