import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        String letter = "";

        System.out.print("Please type a letter: > ");
        letter = input.nextLine().toLowerCase().trim();

        if (letter.equals("a") || letter.equals("e")|| letter.equals("i") || letter.equals("o") || letter.equals("u")){
            System.out.println("Is a Vowel!");
        }else {
            System.out.println("Is a Consoant!");
        }

    }
}
