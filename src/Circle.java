public class Circle {
    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    public double diameter(){
        return 2 * this.radius;
    }
    public double area(){
        return PI * (this.radius * this.radius);
    }
    public double length(){
        return PI * diameter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
