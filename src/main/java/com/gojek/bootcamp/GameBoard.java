package com.gojek.bootcamp;

import java.io.IOException;

public class GameBoard {
    private Input userInput;
    private Output systemOutput;

    public GameBoard(Input userInput, Output systemOutput) {
        this.userInput = userInput;
        this.systemOutput = systemOutput;
    }

    public void processInput() throws IOException {
        systemOutput.print("Enter ALive cells in (x,y) format :");
        systemOutput.printNewLine();

        while (userInput.isEndOfInput()) {
            String input = userInput.nextInput();
            if (isInputValid(input)) {
                String[] inputIndex = input.split(",");
            }
        }
    }

    private boolean isInputValid(String input) {
        return true;
    }
}

