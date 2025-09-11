package constants;

import java.util.List;

public class Constants {
    //game.Menu
    public static final List<String> MENU_OPTIONS = List.of("Start a game", "Change difficulty", "Exit");
    public static final List<String> CATEGORY_OPTIONS = List.of("ANIME", "DEXTER NAMES", "RANDOM");
    public static final String START_GAME_OPTION = "1";
    public static final String CHANGE_DIFFICULTY_OPTION = "2";
    public static final String EXIT_OPTION = "3";

    //Errors
    public static final String INVALID_OPTION = "Invalid option";
    public static final String JSON_FAIL = "Failed to load words from JSON";
    public static final String INT_FAIL = "User's input must be an integer";

    //game.Game
    public static final int FAILS_GAMEOVER = 9;
    public static final String WIN = "===YOU WIN===";
    public static final String LOSE = "===YOU LOSE===";
    public static final String WRONG_INPUT = "Wrong input! Try again";

    //models.Word
    public static final String DASH = "_";

    //GameStages
    public static final String[] GAME_STAGES = {
            """
                        
                        
                        
                        
                        
                        
                        
                        
                        ---------------""",
            """
                        
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |
                         |
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |            0
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |           /
                         |
                         |
                        ---------------""",
            """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |           / \\
                         |
                         |
                        ---------------"""
    };



}
