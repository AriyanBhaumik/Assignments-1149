package Assignment1;
import java.util.*;

public class Sum {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

        short a = Short.parseShort("0");
        short b = Short.parseShort("0");
        System.out.println("enter two numbers :");
        a = sc.nextShort();
        b = sc.nextShort();

        System.out.println("sum : "+ (a+b));
    }
}
