public class Menu {
    private Difficulty difficulty = Difficulty.MEDIUM;
    private final InputReader reader;

    public Menu(InputReader reader)
    {
        this.reader = reader;
    }
    
    public void run()
    {
        boolean isrunning = true;
        while (isrunning)
        {
            ConsoleGameWriter.printMenu();
            String input = reader.readLine();
            isrunning = handleInput(input);
        }
    }

    private void changeDifficulty()
    {
        ConsoleGameWriter.printDifficulty();
        String choice = reader.readLine();
        this.difficulty = Difficulty.fromIndex(choice);
    }

    private String chooseCategory(String choice)
    {
        return switch (choice) {
            case "1" -> "ANIMALS";
            case "2" -> "NAMES";
            case "3" -> "RANDOM";
            default -> "RANDOM";
        };
    }

    private boolean handleInput(String input)
    {
        switch (input) {
            case Constants.START_GAME_OPTION:
                System.out.print("Choose category\n1: ANIMALS\n2: NAMES\n3: RANDOM\n");
                String category = chooseCategory(reader.readLine());
                Game game = new Game(this.reader, category, difficulty);
                game.startGame();
                return true;
            
            case Constants.CHANGE_DIFFICULTY_OPTION:
                changeDifficulty();
                return true;
            
            case Constants.EXIT_OPTION:
                return false;
            default:
                throw new IllegalArgumentException("Invalid option");
        }
    }
}
