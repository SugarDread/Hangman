package io;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class ConsoleGameWriter implements GameWriter {
    private final PrintStream out;

    public ConsoleGameWriter(PrintStream out) {
        this.out = out;
    }

    @Override
    public void printStringLine(String s) {
        out.println(s);
    }

    @Override
    public void printList(List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            out.printf("%d: %s\n", i + 1, options.get(i));
        }
    }

    @Override
    public <T extends Enum<T>> void printEnumList(Enum<T> enumType) {
        List<String> toPrint = Arrays.stream(enumType.getClass().getEnumConstants())
                .map(Object::toString)
                .toList();
        printList(toPrint);
    }

    @Override
    public void printString(String string) {
        out.print(string);
    }
}
