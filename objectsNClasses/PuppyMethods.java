package objectsNClasses;
// Member Functions / Member Variables  -  Classes and Object!
public class PuppyMethods 
{
    int puppyAge;       //Local Variable!! 
 
    public PuppyMethods(String name) {
       // This constructor has one parameter, name.
       System.out.println("Name chosen is :" + name );
    }
 
    public void setAge( int age ) {
       puppyAge = age;
    }
 
    public int getAge( ) {
       System.out.println("Puppy's age is :" + puppyAge );
       return puppyAge;
    }
 
    public static void main(String []args) {
       /* Object creation */
       PuppyMethods myPuppy = new PuppyMethods( "tommy" );
 
       /* Call class method to set puppy's age */
       myPuppy.setAge( 2 );
 
       /* Call another class method to get puppy's age */
       myPuppy.getAge( );
 
       /* You can access instance variable as follows as well */
       System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
 }