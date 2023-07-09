package training.day3;

import java.util.Scanner;

public class Homework {

    public static boolean checker( int number ) {
        boolean flag = false;
        if (number % 2 == 0){
            flag = true;
        }
        return flag;

    }
    public static int smallest( int num1, int num2, int num3 ) {
        int highest = 0;
        if (num1 < num2 && num2 < num3) {
            highest = num1;
            return highest;
        } else if (num2 < num1 && num1 < num3) {
            highest = num2;
        } else if (num3 < num2 && num2 < num1) {
            highest = num3;
        }
        return highest;

    }
    public static void main(String[] args) {

    //zad.1
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter 1st number:");
    int num1 = scanner.nextInt();

    System.out.print("Enter 2nd number:");
    int num2 = scanner.nextInt();

    System.out.print("Enter 3rd number:");
    int num3 = scanner.nextInt();

    System.out.print( smallest(num1, num2, num3) );

    //zad.2
    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Enter number:");
    int number = scanner1.nextInt();

    System.out.print( checker(number) );

    }
}
