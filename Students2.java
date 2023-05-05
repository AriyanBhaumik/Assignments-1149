package Assignment1;

class Student2 {
    private int roll;
    private String name;
    private float score;

    public Student2() {
        roll = 0;
        name = "";
        score = 0;
    }

    public Student2(int roll) {
        this.roll = roll;
        name = "";
        score = 0;
    }

    public Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
        score = 0;
    }

    public Student2(int roll, String name, float score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("roll : " + roll);
        System.out.println("score : " + score);
    }

    public Student2 (Student2 s)
    {
        roll = s.roll;
        name = s.name;
        score = s.score;
    }
}

public class Students2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(07,"Ariyan",90);
        Student2 s2 = new Student2(s1);

        s2.display();
    }
}