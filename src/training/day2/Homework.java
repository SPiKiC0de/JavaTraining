package training.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Momchil
public class Homework {
    public static void main(String [] args){
        //zad.1
        /*
        Scanner scanner = new Scanner(System.in);
        String [] word = {"Алфа","аватар","беда","бреза","салон"};
        for(String words :word){
        if(words.charAt(0)=='а');{
            System.out.println(words);
            }
        }
        */
        //zad.2
        //zad.3
        List<String> words = new ArrayList<String>();
        System.out.print("Enter 4 words:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<4; i++)
        {
            words.add(scanner.next());
        }
        words.removeIf(word -> word.length()<4);
        for (String word:words){
            System.out.println(word);
        }
        scanner.close();
    }

}
