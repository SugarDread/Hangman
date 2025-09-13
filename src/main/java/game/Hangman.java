package game;

import io.ConsoleGameWriter;
import io.ConsoleInputReader;
import io.GameWriter;
import io.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            InputReader inReader = new ConsoleInputReader(reader);
            GameWriter gameWriter = new ConsoleGameWriter(System.out);
            Menu menu = new Menu(inReader, gameWriter);
            menu.run();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
