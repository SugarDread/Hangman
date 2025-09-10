package io;

import models.Word;

import java.util.List;
import java.util.Set;

public interface GameWriter {
    void printString(String s);
    void printList(List<String> options);
    void printDifficulty();
    void printGameStages(int fails);
    void printWord(Word word, Set<Character> userChar);
    void printHint(Word word, boolean hint);

}
