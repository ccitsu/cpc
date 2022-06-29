public class Puppy{
          // This constructor has one parameter, name.
          // Constructor is a member function with the same name as that of the class. 

          public Puppy(String name){
          System.out.println("Passed Name is :" + name );
          }
          public static void main(String []args){
          // Following statement would create an object myPuppy
          
          Puppy myPuppy = new Puppy( "tommy" );
          System.out.println(myPuppy);

          }
}
          