import java.util.Set;

public class ConsoleGameWriter implements GameWriter{
    public static void printStream(String s)
    {
        System.out.println(s);
    }

    public static void printMenu()
    {
        System.out.println(Constants.MENU_OPTIONS);
    }

    public static void printDifficulty()
    {
        for (Difficulty d : Difficulty.values())
        {
            System.out.println(d.getIndex() + ": " + d.name());
        }
    }

    public static void printGameStages(int fails)
    {
        switch (fails) {
            case 0 -> System.out.println(Constants.GAME_STAGE_0);
            case 1 -> System.out.println(Constants.GAME_STAGE_1);
            case 2 -> System.out.println(Constants.GAME_STAGE_2);
            case 3 -> System.out.println(Constants.GAME_STAGE_3);
            case 4 -> System.out.println(Constants.GAME_STAGE_4);
            case 5 -> System.out.println(Constants.GAME_STAGE_5);
            case 6 -> System.out.println(Constants.GAME_STAGE_6);
            case 7 -> System.out.println(Constants.GAME_STAGE_7);
            case 8 -> System.out.println(Constants.GAME_STAGE_8);
            case 9 -> System.out.println(Constants.GAME_STAGE_9);

        }
    }

    public static void printWord(String word, Set<Character> userChar)
    {
        for (char c : word.toCharArray())
        {
            if (userChar.contains(c))
            {
                System.out.print(c);
            }
            else
            {
                System.out.print(Constants.DASH);
            }
        }
        System.out.println("\n");
    }

}
