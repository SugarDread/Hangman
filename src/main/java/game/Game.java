package game;

import constants.Constants;
import io.InputReader;
import models.Difficulty;
import models.Word;
import io.GameWriter;

import java.util.HashSet;

public class Game {
    private int fails;
    private final Word word;
    private final Difficulty difficulty;
    private final InputReader reader;
    private final GameWriter writer;
    private boolean gameOver;
    private final HashSet<Character> userChar;
    private final HashSet<Character> requiredCharacters;
    private boolean hint;

    public Game(InputReader reader, GameWriter writer, String category, Difficulty difficulty)
    {
        this.hint = false;
        this.fails = 0;
        this.difficulty = difficulty;
        this.reader = reader;
        this.writer = writer;
        this.word = new Word(category);
        this.gameOver = false;
        this.userChar = new HashSet<>();
        this.requiredCharacters = new HashSet<>();
        for (char c : this.word.getWord().toCharArray())
        {
            this.requiredCharacters.add(Character.toUpperCase(c));
        }
    }

    
    public void startGame()
    {
        while (!gameOver)
        {   
            writer.printGameStages(fails);
            writer.printWord(word, userChar);
            writer.printHint(word, hint);
            String input = word.userInput(reader);
            logic(input);
        }
        if (fails < Constants.FAILS_GAMEOVER) {writer.printString(Constants.WIN);}
        else 
        {
            writer.printGameStages(Constants.FAILS_GAMEOVER);
            writer.printString(word.getWord());
            writer.printString(Constants.LOSE);
        }

    }

    private void logic(String s)
    {
        if (s.equals("Hint")) {
            hint = !hint;
            return;
        }
        if (s.length() != 1)
        {
            writer.printString(Constants.WRONG_INPUT);
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
        if (failed) { fails += this.difficulty.getValue(); }
        if (fails >= Constants.FAILS_GAMEOVER || requiredCharacters.isEmpty()) {gameOver = true;}
    }
}
