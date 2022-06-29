package objectsNClasses.Variables;
 public class VariableType {
       public void pupAge() {
       int age = 0;
         age = age + 10;
       System.out.println("Puppy age is : " + age);
    }
     public static void main(String args[]) {
       VariableType test = new VariableType();
       test.pupAge();
    }
 }

