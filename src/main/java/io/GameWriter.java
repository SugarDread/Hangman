package io;


import java.util.List;

public interface GameWriter {
    void printStringLine(String s);

    void printList(List<String> options);

    <T extends Enum<T>> void printEnumList(Enum<T> enumType);

    void printString(String string);

}
