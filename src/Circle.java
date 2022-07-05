public class Circle {
    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    public double diameter( double radius){
        return 2 * radius;
    }
    public double area( double radius){
        return PI * (radius * radius);
    }
    public double length(double diameter){
        return PI * diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
