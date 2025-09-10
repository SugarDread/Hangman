package io;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleInputReader implements InputReader {

    private final BufferedReader reader;

    public ConsoleInputReader(BufferedReader reader) {this.reader = reader;}

    @Override
    public String readLine() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
