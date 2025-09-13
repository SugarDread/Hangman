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

    public Game(InputReader reader, GameWriter writer, String category, Difficulty difficulty) {
        this.hint = false;
        this.fails = 0;
        this.difficulty = difficulty;
        this.reader = reader;
        this.writer = writer;
        this.word = new Word(category);
        this.gameOver = false;
        this.userChar = new HashSet<>();
        this.requiredCharacters = new HashSet<>();
        for (char c : this.word.getWord().toCharArray()) {
            this.requiredCharacters.add(Character.toUpperCase(c));
        }
    }


    public void startGame() {
        while (!gameOver) {
            printGameStages(fails);
            printWord();
            printHint();
            String input = word.userInput(reader);
            logic(input);
        }
        if (fails < Constants.FAILS_GAMEOVER) {
            writer.printString(Constants.WIN);
        } else {
            printGameStages(Constants.FAILS_GAMEOVER);
            writer.printString(word.getWord());
            writer.printString(Constants.LOSE);
        }

    }

    private void logic(String s) {
        if (s.equals("Hint")) {
            hint = !hint;
            return;
        }
        if (s.length() != 1) {
            writer.printString(Constants.WRONG_INPUT);
            return;
        }
        boolean failed = true;
        char input = s.charAt(0);
        input = Character.toUpperCase(input);
        if (requiredCharacters.contains(input)) {
            requiredCharacters.remove(input);
            userChar.add(input);
            failed = false;
        }
        if (failed) {
            fails += this.difficulty.getValue();
        }
        if (fails >= Constants.FAILS_GAMEOVER || requiredCharacters.isEmpty()) {
            gameOver = true;
        }
    }

    private void printGameStages(int fails) {
        writer.printString(Constants.GAME_STAGES[fails]);
    }

    private void printHint() {
        if (hint) {
            writer.printString(word.getHint());
        }
    }

    private void printWord() {
        for (char c : word.getWord().toCharArray()) {
            if (userChar.contains(c)) {
                writer.printString(Character.toString(c));
            } else {
                writer.printString(Constants.DASH);
            }
        }
        writer.printString(Constants.NEW_LINE);
        writer.printStringLine(Constants.HINT);
    }
}
