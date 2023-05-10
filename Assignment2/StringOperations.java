import java.util.*;

public class StringOperations {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence-> ");
        String s=in.nextLine();
        s=s.trim(); //so that there are no lading and trailing whitespaces
        
        //number of times 'a' appears
        System.out.println("Number of times a appears in the string->");
        int a=0;
        for(char ch: s.toCharArray()) //checks (iv) where we need to convert the sentence to a char aaray
        {
            if(ch=='a')
            a++;
        }
        System.out.println("Answer= "+a);

        //number of times "and" appears
        System.out.println("Number of times \"and\" appears->");
        int and=0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.substring(i,i+3).equalsIgnoreCase("and"))
            and++;
        }
        System.out.println("Answer= "+and);

        //starts with "the" or not
        if(s.substring(0,3).equalsIgnoreCase("the"))
        System.out.println("Yes, the sentence starts with\"The\".");
        else System.out.println("NO, the sentence doesn't start with \"The\".");

        //finding the tokens in the string
        System.out.println("The tokens in the string are->");
        String curr="";
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ' || ch=='.' || ch=='@')
            {
                System.out.println(curr);
                curr="";
            }
            else curr+=ch;
        }
        in.close();
    }
}
