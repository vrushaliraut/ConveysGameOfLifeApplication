package com.gojek.bootcamp;

import java.io.IOException;

public class ConveysGameOfLifeApplication {
    public static void main(String[] args) throws IOException {
        Input userInput = new UserInput();
        Output systemOutput = new SystemOutput();
        GameBoard gameBoard = new GameBoard(userInput, systemOutput);
        gameBoard.processInput();
        gameBoard.displayGrid();
        boolean isNextIteration = gameBoard.isNextIterationPossible();
    }
}
