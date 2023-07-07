package training.day5;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select Rectangle(r) or Triangle(t):");

        char choice = scanner.next().charAt(0);

        if (choice=='r'||choice=='R'){
            System.out.print("Enter width:");
            double width = scanner.nextDouble();

            System.out.print("Enter length:");
            double length = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(width, length);

            System.out.println("Area:"+rectangle.calculateArea());
            System.out.println("Perimeter:"+rectangle.calculatePerimeter());

        } else if(choice =='t'|| choice == 'T'){
            System.out.print("Enter a:");
            double a = scanner.nextDouble();

            System.out.print("Enter b:");
            double b = scanner.nextDouble();

            System.out.print("Enter c:");
            double c = scanner.nextDouble();

            System.out.print("Enter hb:");
            double hb = scanner.nextDouble();

            Triangle triangle = new Triangle(a, b, c, hb);
            System.out.println("Area:"+triangle.calculateArea());
            System.out.println("Perimeter:"+triangle.calculatePerimeter());

        }else System.out.printf("Invalid!");

    }
}
