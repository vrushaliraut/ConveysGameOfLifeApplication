package com.gojek.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput implements Input {

    private static final String IS_END_OF_FILE = "eof";
    private BufferedReader reader;
    private boolean isEndOf;

    public UserInput() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String nextInput() throws IOException {
        String input = reader.readLine();
        if (input == null || input.equalsIgnoreCase(IS_END_OF_FILE)) {
            endOfFileSetter(true);
        }
        return input;
    }

    @Override
    public boolean isEndOfInput() {
        return isEndOfFileGettoer();
    }

    @Override
    public void close() throws IOException {
    }

    public boolean isEndOfFileGettoer() {
        return isEndOf;
    }

    public void endOfFileSetter(boolean isEndOf) {
        this.isEndOf = isEndOf;
    }
}
