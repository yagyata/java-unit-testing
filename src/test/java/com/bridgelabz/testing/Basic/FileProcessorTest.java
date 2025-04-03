package com.bridgelabz.testing.Basic;

import com.bridgelabz.junit.Basic.FileProcessor;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest{
    static final String fileName = "file.txt";
    String content = "Hello! My name is Yagyata.";

    @Test
    public void shouldWriteAndWriteToFile() throws IOException {
        FileProcessor.writeToFile(fileName,content);
        String readContent = FileProcessor.readFromFile(fileName);
        assertEquals(readContent, content);
    }

    @Test
    public void testFileExistenceAfterWriting() {
        File file = new File(fileName);
        assertTrue(file.exists());
    }

    @Test
    public void testIOExceptionIfFileAbsent() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("non-existing-file.txt"));
    }

}