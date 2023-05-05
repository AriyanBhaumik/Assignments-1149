package Assignment1;


public class Cmd {
    public static void main(String args[])
    {
        int count = Integer.parseInt("0");

        for(int i=0;i<args.length;i++)
            {
                System.out.println(args[i]);
                count++;
            }

        System.out.println("total count : "+count);
    }
}
