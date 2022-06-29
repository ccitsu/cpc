public class ClassObjDemo {  
    // Member Function in the Class! 
    public void MyClass(String univID,String age, String name)
    {
        System.out.println("Passed UnivID is : "+univID);
        System.out.println("Passed age is : "+age);
        System.out.println("Passed age is : "+name);
    }
    // Main Function in the Class!!
    public static void main(String args[])
    {
        ClassObjDemo CCIT = new ClassObjDemo();
        CCIT.MyClass("123456","30","Nayyar");
    }
}
