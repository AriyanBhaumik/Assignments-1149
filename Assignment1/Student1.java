package Assignment1;
import java.util.*;

class Student {
    private String name;
    private int roll;
    private float score;

    Scanner sc = new Scanner(System.in);

    public Student() {
        name = "";
        roll = 0;
        score = 0;
    }

    public void setData() {
        System.out.println("enter the name , roll and score : ");
        name = sc.nextLine();
        roll = sc.nextInt();
        score = sc.nextFloat();
    }

    public void display() {
        System.out.println("name : "+name);
        System.out.println("roll : "+roll);
        System.out.println("score : "+score);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData();
        Student s2 = s1;    // Here Shallow Copy is done here ............

        s2.display();
    }
}
