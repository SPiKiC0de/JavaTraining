package training.day2;

import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //zad.1
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day:");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.print("Monday!");
                break;
            case 2:
                System.out.print("Tuesday!");
                break;
            case 3:
                System.out.print("Wednesday!");
            case 4:
                System.out.print("Thursday!");
                break;
            case 5:
                System.out.print("Friday!");
                break;
            case 6:
                System.out.print("Saturday!");
                break;
            case 7:
                System.out.print("Sunday!");
                break;
            default:System.out.print("The is no "+ day +"th day of the week");
            */
        //zad.2
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Register your name:");
        String name = scanner.next();

        System.out.print("Register your password:");
        String pass = scanner.next();
        System.out.print("Registered successfully!");
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Log in with your name:");
        String namechecker = scanner1.next();

        System.out.print("Log in with your password:");
        String passcheck = scanner1.next();

        if (name.equals(namechecker)&&pass.equals(passcheck))
        {
                System.out.println("Welcome, "+name);

        }else{
            System.out.println("Wrong credentials!");
        }

        */
        //zad.3
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word:");
        String word = scanner.nextLine();

         for (int i =0; i<word.length();i++){
             char letters = word.toCharArray()[i];
             System.out.println(letters);
         }
         */
         //zad.4
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight:");
        int weight = scanner.nextInt();

        if (weight>=50&&70>=weight){
            System.out.print("You are skinny!");
        }else if(weight>=71&&90>=weight){
            System.out.print("You are skinny fat!");
        }else if(weight>=91&&110>=weight){
            System.out.print("You are obese!");
        }else if(weight>=111){
            System.out.print("You are extra obese!");
        }
        */
        //zad.5
        /*
        String array[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
        */
        }
}
