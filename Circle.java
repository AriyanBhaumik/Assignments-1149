package Assignment1;

import java.util.*;

class Helper{
    private float radius;
    final double PI = 3.14;
    
    Scanner sc = new Scanner(System.in);

    Helper(){
        radius = 0;
    }

    public void setRadius(){
        System.out.println("enter the radius= ");
        radius = sc.nextFloat();        
    }

    public void getArea(){
        System.out.println("area : "+ (PI*radius*radius));
    }
}
public class Circle {
    public static void main(String args[]) {
        Helper h=new Helper();
        h.setRadius();
        h.getArea();
    }
}
