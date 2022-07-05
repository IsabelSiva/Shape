import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double width, height;
        Rectangle rectangle;

        System.out.println("Entre com a altura do retângulo.");
        height = sc.nextDouble();
        System.out.println("Entre com a base do retângulo.");
        width = sc.nextDouble();

        rectangle = new Rectangle(width, height);

        System.out.println("Area do retângulo: " + rectangle.area(width, height));
        System.out.println("Perimetro do retângulo: " + rectangle.perimeter(width, height));
        System.out.println("Diagonal do retângulo: " + rectangle.diagonal(width, height));

        sc.close();
    }
}
