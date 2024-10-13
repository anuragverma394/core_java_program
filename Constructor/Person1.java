package Constructor;

public class Person1 {
    private String name;
    private int age;

    // creating default constructor
    Person1(){
        name = "John";
        age = 10;

    }
    // perametrize constructor
    Person1(String s,int i){
        name = s;
        age = i;
    }
    // method
    void Talk(){
        System.out.println("My name is ="+name);
        System.out.println("my age is ="+age);
    
    }
    

}
class Demo1{
    public static void main(String[] args ){
        Person1 pr = new Person1();
        pr.Talk();
        Person1 pr1 = new Person1("ram",21);
        pr1.Talk();
    }
}
