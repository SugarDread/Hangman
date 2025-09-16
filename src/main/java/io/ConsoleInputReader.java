package io;

import constants.Constants;

import java.io.BufferedReader;
import java.io.IOException;

public class ConsoleInputReader implements InputReader {

    private final BufferedReader reader;

    public ConsoleInputReader(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String readStr() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Integer readInt(GameWriter writer) {
        try {
            return Integer.parseInt(this.reader.readLine());
        } catch (NumberFormatException e) {
            writer.printString(Constants.INT_FAIL);
            return -1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
