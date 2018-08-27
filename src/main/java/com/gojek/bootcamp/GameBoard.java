package com.gojek.bootcamp;

import java.io.IOException;

public class GameBoard {
    private Input userInput;
    private Output systemOutput;
    private Grid grid;

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
                grid.insertAliveCell(Integer.parseInt(inputIndex[0]), Integer.parseInt(inputIndex[1]));
            }
        }
    }

    private boolean isInputValid(String input) {
        if (input == null && input.length() == 0)
            return false;

        String[] inputarray = input.split(",");
        if (inputarray.length != 2) {
            return false;
        }
        try {
            Integer.parseInt(inputarray[0]);
            Integer.parseInt(inputarray[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void displayGrid() {
        int minIndex = grid.getMinIndex();
        int maxIndex = grid.getMaxIndex();
        systemOutput.clearScreen();
        systemOutput.print("Current Iteration :: ");
        systemOutput.printNewLine();
        for (int x = minIndex; x <= maxIndex; x++) {
            for (int y = minIndex; y <= maxIndex; y++) {
                if (grid.isCellAlive(x, y)) {
                    systemOutput.print("O ");
                } else {
                    systemOutput.print("- ");
                }
            }
            systemOutput.printNewLine();
        }

    }

    public boolean isNextIterationPossible() {
        int minIndex = grid.getMinIndex();
        int maxIndex = grid.getMaxIndex();
        boolean isNextIterationPossible = false;

        for (int xLoop = minIndex; xLoop <= maxIndex; xLoop++) {
            for (int yLoop = minIndex; yLoop <= maxIndex; yLoop++) {
                if (grid.isCellAlive(xLoop, yLoop)){
                    isNextIterationPossible = true;
                    break;
                }
            }
            if (isNextIterationPossible) break;
        }
        return isNextIterationPossible;
    }

    public void nextIteration() {

    }
}
