import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double a, b, c, area;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        area = triangle(a, c);
        System.out.printf("TRIANGULO: %.3f\n", area);
        
        area = circle(c);
        System.out.printf("CIRCULO: %.3f\n", area);

        area = trapeze(a, b, c);
        System.out.printf("TRAPEZIO: %.3f\n", area);

        area = square(b);
        System.out.printf("QUADRADO: %.3f\n", area);

        area = rectangle(a, b);
        System.out.printf("RETANGULO: %.3f\n", area);
        scan.close();
    }

    public static double triangle(double a, double c){
        return (a * c)/2;
    }

    public static double circle(double c){
        double pi = 3.14159;

        return pi * Math.pow(c, 2);
    }

    public static double trapeze(double a, double b, double c){
        return ((a+b)/2) * c;
    }

    public static double square(double b){
        return b * b;
    }

    public static double rectangle(double a, double b){
        return a * b;
    }

}