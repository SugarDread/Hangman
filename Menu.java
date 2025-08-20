import java.util.Scanner;

public class Menu {
    private Difficulty difficulty = Difficulty.MEDIUM;
    private final Scanner scanner;

    public Menu(Scanner scanner)
    {
        this.scanner = scanner;
    }

    private void display()
    {
        System.out.print("1: Start a game\n2: Change difficulty\n3: Exit\n");
    }
    
    public void run()
    {
        boolean isrunning = true;
        while (isrunning)
        {
            display();
            int input = Integer.parseInt(scanner.nextLine());
            isrunning = handleInput(input);
        }
    }

    private void changeDifficulty()
    {
        System.out.print("1: EASY\n2: MEDIUM\n3: HARD\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                this.difficulty = Difficulty.EASY;
                break;
            case 2:
                this.difficulty = Difficulty.MEDIUM;
                break;
            case 3:
                this.difficulty = Difficulty.HARD;
                break;
        }
    }

    private boolean handleInput(int input)
    {
        switch (input) {
            case 1:
                System.out.print("Choose category\n1: ANIMALS\n2: NAMES\n3: RANDOM\n");
                int choice = Integer.parseInt(scanner.nextLine());
                String category = "RANDOM";
                switch (choice) {
                    case 1:
                        category = "ANIMALS";
                        break;
                    case 2:
                        category = "NAMES";
                        break;
                    case 3:
                        category = "RANDOM";
                        break;
                }
                Game game = new Game(this.scanner, category, difficulty);
                game.startGame();
                return true;
            
            case 2:
                changeDifficulty();
                return true;
            
            case 3:
                return false;
            default:
                System.out.println("Wrong input");
                return true;
        }
    }
}
