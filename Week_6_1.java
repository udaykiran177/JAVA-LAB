import java.util.*;
abstract class shape {
    abstract void printArea(int x,int y);
}
class Rectangle extends shape {
    void printArea(int x,int y) {
        System.out.println("Area is :"+x*y);
     }
}
class Triangle extends shape {
    void printArea(int x,int y) {
        System.out.println("Area is :"+x*y);
     }
}
class Circle extends shape {
    void printArea(int x,int y) {
        System.out.println("Area is :"+x*y);
     }
}
class week_6_1 {
    public static void main(String args[]) {
        Scanner n=new Scanner(System.in);
        Rectangle r=new Rectangle();
        System.out.println("Enter length and breadth of rectangle:");
        int a,b;
        a=n.nextInt();
        b=n.nextInt();
        r.printArea(a,b);
        Triangle t=new Triangle();
        System.out.println("Enter base and height of triangle:");
        a=n.nextInt();
        b=n.nextInt();
        t.printArea(a,b);
        Circle c=new Circle();
        System.out.println("Enter radius of circle:");
        a=n.nextInt();
        c.printArea(a,a);
     }
}
