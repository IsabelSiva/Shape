public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(double width, double height){
        return width * height;
    }
    public double perimeter(double width, double height){
        return 2 * (width + height);
    }
    public double diagonal(double width, double height){
        return Math.sqrt((width * width) + (height * height));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
