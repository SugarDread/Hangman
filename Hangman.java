import java.util.Scanner;

public class Hangman {
    private Difficulty difficulty;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.run();
    }
}
