import java.util.Scanner;

public class Game {
    private int fails;
    private Word word;
    private Difficulty difficulty;
    private GameStages gameStages;
    private final Scanner scanner;
    private boolean gameOver;

    public Game(Scanner scanner, String category, Difficulty difficulty)
    {
        this.fails = 0;
        this.difficulty = difficulty;
        this.gameStages = new GameStages();
        this.scanner = scanner;
        this.word = new Word(category);
        this.gameOver = false;
    }

    
    public void startGame()
    {
        while (!gameOver)
        {   
            gameStages.draw(fails);
            logic();   
        }
        gameStages.draw(fails);
        if (fails != 6) {System.out.println("===YOU WIN===");}
        else 
        {
            word.printAnswer();
            System.out.println("===YOU LOSE===");
        }

    }

    private void logic()
    {
        word.printWord();
        boolean failed = word.userInput(scanner);
        switch (this.difficulty) {
            case EASY:
                if (failed) {fails += 1;}
                break;
            case MEDIUM:
                if (failed) {fails += 2;}
                break;
            case HARD:
                if (failed) {fails += 3;}
                break;
        }
        if (fails == 6 || word.isWin()) {gameOver = true;}
    }
}
