package Constructor;

public class Person {
    // first we will declear instance variables
    String name;
    int age;

    // declearing Method  
    void Talk(){
        System.out.println("Hello I am " + name);
        System.out.println("My age is " + age);
    }
    
}
class Demo {
    public static void main(String[] args){
        //creatring person class object 
        Person Anurag = new Person();

        // For find Hash code of object
        System.out.println("Hash code =" +Anurag.hashCode());
        // initialize the instance variables using the reference
        Anurag.name="Anurag";
        Anurag.age=28;
        
        //  call the Talk method 
        Anurag.Talk();
    }
}
