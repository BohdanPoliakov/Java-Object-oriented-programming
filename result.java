import java.util.Scanner;

abstract class Figura {
    abstract double getArea();
    abstract double getPerimeter();
}

class Rectangle extends Figura {
    private double width;  // Platums
    private double height; // Garums

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override // Metode, kas implementē abstraktās metodes no klases Figura
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadiet taisnstūru skaitu: ");
        int count = sc.nextInt();

        Figura[] figuras = new Figura[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("Ievadiet taisnstūra %d. platumu un garumu (atdala ar tukšumu): ", i + 1);
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            figuras[i] = new Rectangle(width, height);
        }

        for (int i = 0; i < count; i++) {
            double area = figuras[i].getArea();
            double perimeter = figuras[i].getPerimeter();
            System.out.printf("%.2f %.2f%n", area, perimeter);
        }

        sc.close();
    }
}