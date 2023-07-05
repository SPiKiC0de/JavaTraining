package training.day3;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public static void swap(ArrayList<String> arrayList){
        if(arrayList.size()>=2){
            String first = arrayList.get(0);
            String second = arrayList.get(arrayList.size()-1);

            arrayList.set(0,second);
            arrayList.set(arrayList.size()-1, first);
        }
    }
    public static void initials(String name1, String name2){

        System.out.print(name1.charAt(0));
        System.out.print(name2.charAt(0));

    }
    public static void revers(String words){
        String[] temp = words.split(" ");
        words ="";

        for (int i =temp.length-1;i>=0;i--){
            words = words.concat(temp[i]+" ");
        }

        System.out.println(words);
    }
    public static void check(String str1, String str2){
        if (str1.contains(str2)){
            String result = str1.replace(str2, "");
            System.out.print(result);
        }
    }
    public static Integer fives(Integer[] numbers){
        int count = 0;
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]==5){
                count++;
            }
        }
        return count;
    }
    public static void even(Integer[] numbers){
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]);
            }
        }
    }
    public static void odd(Integer[] numbers){
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                System.out.println(numbers[i]);
            }
        }
    }
    public static void negative(Integer[] numbers){
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]<0){
                System.out.println(numbers[i]);
            }
        }

    }
    public static void positive(Integer[] numbers){
       for (int i = 0; i<numbers.length;i++){
           if (numbers[i]>=0){
               System.out.println(numbers[i]);
           }
       }
    }
    public static void main(String[] args){
        //zad.1
        /*
        Integer[] array = {10,2,-1,1,5,9,7,6,5,-5};
        System.out.println("Positive");
        positive(array);

        System.out.println("Negative");
        negative(array);

        System.out.println("Odd");
        odd(array);

        System.out.println("Even");
        even(array);

        System.out.println("5-s");
        System.out.print(fives(array));
        */
        //zad.2
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter 1st word:");
        String str1 = scanner.next();

        System.out.printf("Enter 2nd word:");
        String str2 = scanner.next();

        System.out.print(check(str1,str2));
         */
        //zad.3
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to revers:");
        String words = scanner.nextLine();

        revers(words);
        */
        //zad.4
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String name = scanner.nextLine();

        System.out.print("Enter your last name:");
        String name1 = scanner.nextLine();

        initials(name,name1);
         */
        //zad.5
        //
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("Enter how many words are you going to write:");
        int boundary = scanner.nextInt();

        for (int i = 0;i<boundary;i++){
            System.out.print("Enter your word:");
            String word = scanner.next();
            arr.add(word);
        }
        swap(arr);
        for (String element:arr){
            System.out.print(element+",");
        }

    }
}
