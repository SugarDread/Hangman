package game;

import constants.Constants;
import io.GameWriter;
import io.InputReader;
import models.Difficulty;

public class Menu {
    private Difficulty difficulty = Difficulty.MEDIUM;
    private final InputReader reader;
    private final GameWriter writer;

    public Menu(InputReader reader, GameWriter writer)
    {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void run()
    {
        boolean isrunning = true;
        while (isrunning)
        {
            writer.printList(Constants.MENU_OPTIONS);
            String input = reader.readStr();
            isrunning = handleInput(input);
        }
    }

    private void changeDifficulty()
    {
        writer.printDifficulty();
        int choice = reader.readInt(writer);
        if (choice < Difficulty.values().length & choice != -1)
        {
            this.difficulty = Difficulty.values()[choice - 1];
        }
        else
        {
            writer.printString(Constants.INVALID_OPTION);
        }
    }

    private String chooseCategory(String choice)
    {
        return switch (choice) {
            case "1" -> "ANIME";
            case "2" -> "DEXTER NAMES";
            case "3" -> "RANDOM";
            default -> "RANDOM";
        };
    }

    private boolean handleInput(String input)
    {
        switch (input) {
            case Constants.START_GAME_OPTION:
                writer.printList(Constants.CATEGORY_OPTIONS);
                String category = chooseCategory(reader.readStr());
                Game game = new Game(this.reader, this.writer, category, difficulty);
                game.startGame();
                return true;
            
            case Constants.CHANGE_DIFFICULTY_OPTION:
                changeDifficulty();
                return true;
            
            case Constants.EXIT_OPTION:
                return false;
            default:
                writer.printString(Constants.INVALID_OPTION);
                return true;
        }
    }
}
