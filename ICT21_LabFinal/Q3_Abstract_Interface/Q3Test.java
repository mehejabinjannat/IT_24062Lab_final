// Q3: Abstract Class vs Interface (WITH SUBCLASSES)

abstract class Shape {
    abstract double area();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    double r = 5;
    @Override
    double area() { return Math.PI * r * r; }
    @Override
    public void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape implements Drawable {
    double w = 4, h = 3;
    @Override
    double area() { return w * h; }
    @Override
    public void draw() { System.out.println("Drawing Rectangle"); }
}

public class Q3Test {
    public static void main(String[] args) {
        Shape s1 = new Circle();     // subclass object
        Shape s2 = new Rectangle();  // subclass object

        System.out.println(s1.area());
        ((Drawable)s1).draw();

        System.out.println(s2.area());
        ((Drawable)s2).draw();
    }
}
