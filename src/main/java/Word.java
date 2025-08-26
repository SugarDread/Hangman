import java.util.Random;

public class Word {
    private final String word;
    private String[] wordsPool = {"CAT", "WOLF", "KENGURU", "PANDA", "SPIDER",
                                  "JOHN", "JANE", "STEVEN", "PETER", "MCLOVIN"};

    public Word(String category)
    {
        this.word = randWord(category);
    }

    public String userInput(InputReader reader)
    {
        System.out.print("Type a character: ");
        return reader.readLine();
    }

    public String randWord(String category)
    {
        Random random = new Random();
        return switch (category) {
            case "ANIMALS" -> wordsPool[random.nextInt(6)];
            case "NAMES" -> wordsPool[random.nextInt(6, 10)];
            case "RANDOM" -> wordsPool[random.nextInt(10)];
            default -> "ZOMBIE";
        };
    }

    public String getWord()
    {
        return word;
    }
}
