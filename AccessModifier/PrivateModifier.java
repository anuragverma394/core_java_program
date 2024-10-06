/**
 * PrivateModifier
 */
public class PrivateModifier {
    private int iAmprivate;
    private void privateMethod(){
        System.out.println("I am a private method ");
    }

    public static void main(String[] args) {
        PrivateModifier ob1= new PrivateModifier();

        //Accessing private methods and  variables outside their class raises an error;
        ob1.iAmprivate=20;
        System.out.println("value of the private member is " + ob1.iAmprivate);
        ob1.privateMethod();
        
    }
}
class PrivateModifier1{
    public static void main(String[] args) {
        PrivateModifier1 ob2= new PrivateModifier1();
        ob2.iAmprivate=20;// because of the private member it cannot be accessed outside
        System.out.println(ob2.iAmprivate);
        ob2.privateMethod();
}
