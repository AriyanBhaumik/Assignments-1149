import java.util.*;

class Helper
{
    private int roll;
    private String name;
    private int score;
    Scanner in=new Scanner(System.in);

    Helper()
    {
        roll=0;
        name="";
        score=0;
    }

    void setDetails()
    {
        System.out.println("Enter name= ");
        this.name=in.next();
        System.out.println("Enter roll number= ");
        this.roll=in.nextInt();
    }

    void setScore()
    {
        int m=-1;
        System.out.println("Enter the score of the student= ");
        while(m<0 || m>100)
        {
            try{
            m=in.nextInt();
            if(m>100 || m<0)
            throw new IllegalArgumentException("Mark should be between 0 and 100");
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }
        this.score=m;
    }

    void display()
    {
        System.out.println("Name= "+name);
        System.out.println("Roll= "+roll);
        System.out.println("Marks= "+score);
    }
}

public class Student {
    public static void main(String args[]) {
        Helper ob=new Helper();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details: ");
        ob.setDetails();
        ob.setScore();
        System.out.println("Operation successful.");
        System.out.println("The details entered are -> ");
        ob.display();
        sc.close();
    }
}
