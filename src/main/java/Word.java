import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Word {
    private final String word;
    private final String hint;
    private final static List<WordEntry> wordsPool;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            URL resource = Word.class.getClassLoader().getResource("words.json");
            wordsPool = List.of(mapper.readValue(Paths.get(resource.toURI()).toFile(), WordEntry[].class));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(Constants.JSON_FAIL, e);
        }
    }

    public Word(String category)
    {
        WordEntry entry = randWord(category);
        this.word = entry.word();
        this.hint = entry.hint();
    }

    public String userInput(InputReader reader)
    {
        System.out.print("Type a character: ");
        return reader.readLine();
    }

    public WordEntry randWord(String category) {
        Random random = new Random();
        List<WordEntry> filtered = wordsPool.stream()
                .filter(entry -> entry.category().equals(category) | "RANDOM".equals(category))
                .toList();

        if (filtered.isEmpty()) {
            return new WordEntry("DEFAULT", "ZOMBIE", "UNDEAD");
        }

        return filtered.get(random.nextInt(filtered.size()));
    }

    public String getWord() {
        return word;
    }

    public String getHint() {
        return hint;
    }
}
