package io;
import models.Difficulty;
import models.Word;
import constants.Constants;

import java.io.PrintStream;
import java.util.List;
import java.util.Set;

public class ConsoleGameWriter implements GameWriter {
    private final PrintStream out;

    public ConsoleGameWriter(PrintStream out)
    {
        this.out = out;
    }

    @Override
    public void printString(String s)
    {
        out.println(s);
    }

    @Override
    public void printList(List<String> options)
    {
        for (int i = 0; i < options.size(); i++)
        {
            out.printf("%d: %s\n", i + 1, options.get(i));
        }
    }

    @Override
    public void printDifficulty()
    {
        for (Difficulty d : Difficulty.values())
        {
            out.printf("%d: %s\n", d.ordinal() + 1, d.name());
        }
    }

    @Override
    public void printGameStages(int fails)
    {
        out.println(Constants.GAME_STAGES[fails]);
    }

    @Override
    public void printWord(Word word, Set<Character> userChar)
    {
        for (char c : word.getWord().toCharArray())
        {
            if (userChar.contains(c))
            {
                out.print(c);
            }
            else
            {
                out.print(Constants.DASH);
            }
        }
        out.println("\n");
        out.println("Type 'Hint' to see or remove the hint");
    }

    @Override
    public void printHint(Word word, boolean hint)
    {
        if (hint) { out.println("Hint: " + word.getHint()); }
    }

}
