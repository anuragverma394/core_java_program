/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


/**
 *
* @author anurag
*/
public class Allmethod_String {
    public static void main(String[] args)
    {
        // it will store in pool memory
        String str ="JAVA";
        
        //we can create object of string by using new operator
        String Str1 = new String("java");
        
        // use lower case to change the string
        String str2=str.toLowerCase();
        
        //find length of string
        int s=str.length();
        
        //to remove extra space in string using Trim() method
        String s1= "      java      ";
        s1=s1.trim();
        
        //print Statements
        System.out.println(str);
        System.out.println(Str1);
        System.out.println("string str convert from JAVA to = " +str2);
        System.out.println("length of the given  string is = "+s);
        System.out.println(s1);
    }
    
}
