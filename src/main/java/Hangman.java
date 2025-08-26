import java.io.Reader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Hangman {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        InputReader reader = new ConsoleInputReader(scanner);
        Menu menu = new Menu(reader);
        menu.run();

    }
}
