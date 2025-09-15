package io;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ConsoleInputReaderTest {
    private final BufferedReader reader = mock(BufferedReader.class);
    private final GameWriter gameWriter = mock(GameWriter.class);
    private final ConsoleInputReader consoleInputReader = new ConsoleInputReader(reader);

    @Test
    public void test() throws IOException {
        when(reader.readLine()).thenReturn("wedfk;sdmfdlks");

        consoleInputReader.readInt(gameWriter);

        Mockito.verify(reader, times(1)).readLine();
    }
}