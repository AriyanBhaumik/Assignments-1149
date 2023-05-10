import java.util.*;

public class WrapperC {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a number of Integer type= ");
        int n=in.nextInt();
        int ob=Integer.valueOf(n); //Conversion from basic type to object
        System.out.println("Number after conversion from basic to object= "+ob);

        System.out.println("Enter a number to be stored in Integer object");
        Integer obj=Integer.valueOf(in.nextInt());
        System.out.println("Number after conversion from obejct to basic type= "+obj.intValue());
        
        System.out.println("Using the first number to do String checkers as asked in the problem.");
        String s=Integer.toString(n);
        System.out.println("The number after being converted to String= "+s);

        String numStr="1234";
        System.out.println("We have considered String \"1234\" and using it for conversion.");
        int num=Integer.parseInt(numStr);
        System.out.println("The converted number is= "+num);
        Integer numObj = Integer.valueOf(num);
        String xd=Integer.toString(numObj);
        System.out.println("The final string is= "+xd);
        
        in.close();

    }
}
