package Assignment1;

class Check{

    public void show(int n)
    {
        System.out.println("I am an integer");
    }
    public void show(double d)
    {
        System.out.println("I am a double");
    }
}

public class Casting {
    public static void main(String args[]) {
        short a = Short.parseShort("5");
        double d = Double.parseDouble("5.55");

        Check c = new Check();

        c.show(a);
        c.show(d);
    }
}
