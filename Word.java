import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Word {
    private String word;
    private HashSet<Character> userChar;
    private HashSet<Character> requiredCharacters;
    private String[] wordsPool = {"CAT", "WOLF", "KENGURU", "PANDA", "SPIDER",
                                  "JOHN", "JANE", "STEVEN", "PETER", "MCLOVIN"};

    public Word(String category)
    {
        this.word = randWord(category);
        this.userChar = new HashSet<Character>();
        this.requiredCharacters = new HashSet<Character>();
        for (char c : this.word.toCharArray())
        {
            this.requiredCharacters.add(Character.toUpperCase(c));
        }
    }

    public void printWord()
    {
        for (char c : this.word.toCharArray())
        {
            if (userChar.contains(c))
            {
                System.out.print(c);
            }
            else
            {
                System.out.print("_");
            }
        }
        System.out.println("\n");
    }

    public boolean userInput(Scanner scanner)
    {
        System.out.print("Type a character: ");
        char input = scanner.nextLine().charAt(0);
        input = Character.toUpperCase(input);
        if (requiredCharacters.contains(input))
        {
            requiredCharacters.remove(input);
            userChar.add(input);
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isWin()
    {
        if (requiredCharacters.isEmpty()) {return true;}
        else return false;
    }

    public String randWord(String category)
    {
        Random random = new Random();
        switch (category) {
            case "ANIMALS":
                return wordsPool[random.nextInt(6)];
            case "NAMES":
                return wordsPool[random.nextInt(6, 10)];
            case "RANDOM":
                return wordsPool[random.nextInt( 10)];
            default:
                return "ZOMBIE";
        }
    }

    public void printAnswer()
    {
        System.out.println(word);
    }
}
