import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double width, height, radius;
        Rectangle rectangle;
        Circle circle;

        System.out.println("Entre com a altura do retângulo.");
        height = sc.nextDouble();
        System.out.println("Entre com a base do retângulo.");
        width = sc.nextDouble();

        rectangle = new Rectangle(width, height);

        System.out.println("Area do retângulo: " + rectangle.area());
        System.out.println("Perimetro do retângulo: " + rectangle.perimeter());
        System.out.println("Diagonal do retângulo: " + rectangle.diagonal());

        System.out.println("************************************************************");

        System.out.println("Entre com o raio do circulo.");
        radius = sc.nextDouble();

        circle = new Circle(radius);

        System.out.println("A diagonal do circulo: "+ circle.diameter());
        System.out.println("O comprimento do circulo: "+ circle.length());
        System.out.println("A area do circulo: "+ circle.area());

        sc.close();
    }
}
