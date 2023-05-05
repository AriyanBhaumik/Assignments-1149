package Assignment1;
import java.util.*;

public class Compare {
    public static void main(String args[])
    {
        String s1 = new String();
        String s2 = new String();

        s1 = "abc";
        s2 = "abc";
        String s3 = new String("abc");

        //Creating two objetcs
        System.out.println("Checking equality with = operator: "+ (s1==s2));
        System.out.println("Checking equality with equals(): "+ s1.equals(s2));
       
        //Comparing two strings
        System.out.println("Checking equality with = operator: "+ (s1==s3));
        System.out.println("Checking equality with equals(): "+ s1.equals(s3));
    }
}
