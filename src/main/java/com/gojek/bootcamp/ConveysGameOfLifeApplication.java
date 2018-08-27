package com.gojek.bootcamp;

import java.io.IOException;

public class ConveysGameOfLifeApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        Input userInput = new UserInput();
        Output systemOutput = new SystemOutput();
        GameBoard gameBoard = new GameBoard(userInput, systemOutput);
        gameBoard.processInput();
        gameBoard.displayGrid();

        while (gameBoard.isNextIterationPossible()) {
            gameBoard.nextIteration();
            gameBoard.displayGrid();
            Thread.sleep(1000);
        }
    }
}
