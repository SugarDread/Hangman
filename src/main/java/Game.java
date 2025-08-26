import java.util.HashSet;

public class Game {
    private int fails;
    private final Word word;
    private final Difficulty difficulty;
    private final InputReader reader;
    private boolean gameOver;
    private HashSet<Character> userChar;
    private HashSet<Character> requiredCharacters;

    public Game(InputReader reader, String category, Difficulty difficulty)
    {
        this.fails = 0;
        this.difficulty = difficulty;
        this.reader = reader;
        this.word = new Word(category);
        this.gameOver = false;
        this.userChar = new HashSet<Character>();
        this.requiredCharacters = new HashSet<Character>();
        for (char c : this.word.getWord().toCharArray())
        {
            this.requiredCharacters.add(Character.toUpperCase(c));
        }
    }

    
    public void startGame()
    {
        while (!gameOver)
        {   
            ConsoleGameWriter.printGameStages(fails);
            ConsoleGameWriter.printWord(word.getWord(), userChar);
            String input = word.userInput(reader);
            logic(input);
        }
        if (fails < Constants.FAILS_GAMEOVER) {ConsoleGameWriter.printStream(Constants.WIN);}
        else 
        {
            ConsoleGameWriter.printGameStages(Constants.FAILS_GAMEOVER);
            ConsoleGameWriter.printStream(word.getWord());
            ConsoleGameWriter.printStream(Constants.LOSE);
        }

    }

    private void logic(String s)
    {
        if (s.length() != 1)
        {
            ConsoleGameWriter.printStream(Constants.WRONG_INPUT);
            return;
        }
        boolean failed = true;
        char input = s.charAt(0);
        input = Character.toUpperCase(input);
        if (requiredCharacters.contains(input))
        {
            requiredCharacters.remove(input);
            userChar.add(input);
            failed = false;
        }
        if (failed) {fails += this.difficulty.getValue();}
        if (fails >= Constants.FAILS_GAMEOVER || requiredCharacters.isEmpty()) {gameOver = true;}
    }
}
