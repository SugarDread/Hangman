public class Constants {
    //Menu
    public static final String MENU_OPTIONS = "1: Start a game\n2: Change difficulty\n3: Exit";
    public static final String CATEGORY_OPTIONS = "Choose category\n1: ANIME\n2: DEXTER NAMES\n3: RANDOM";
    public static final String START_GAME_OPTION = "1";
    public static final String CHANGE_DIFFICULTY_OPTION = "2";
    public static final String EXIT_OPTION = "3";

    //Errors
    public static final String INVALID_OPTION = "Invalid option";
    public static final String JSON_FAIL = "Failed to load words from JSON";

    //Game
    public static final int FAILS_EASY = 1;
    public static final int FAILS_MEDIUM = 2;
    public static final int FAILS_HARD = 3;
    public static final int FAILS_GAMEOVER = 9;
    public static final String WIN = "===YOU WIN===";
    public static final String LOSE = "===YOU LOSE===";
    public static final String WRONG_INPUT = "Wrong input! Try again";

    //Word
    public static final String DASH = "_";

    //GameStages
    public static final String GAME_STAGE_0 = """
                        
                        
                        
                        
                        
                        
                        
                        
                        ---------------""";
    public static final String GAME_STAGE_1 = """
                        
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_2 = """
                         --------------
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_3 = """
                         --------------
                         |            |
                         |            |
                         |
                         |
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_4 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_5 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |            0
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_6 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_7 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_8 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |           /
                         |
                         |
                        ---------------""";
    public static final String GAME_STAGE_9 = """
                         --------------
                         |            |
                         |            |
                         |            o
                         |           /0\\
                         |           / \\
                         |
                         |
                        ---------------""";



}
