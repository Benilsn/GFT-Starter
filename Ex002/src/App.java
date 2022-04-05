import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.print("Type a letter: > ");
        String firstLetter = input.nextLine();

        System.out.print("Type another letter: > ");
        String secondLetter = input.nextLine();

        var list = Stream.of(alphabet); 

    }
}
