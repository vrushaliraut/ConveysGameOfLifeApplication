package com.gojek.bootcamp;

public class ConveysGameOfLifeApplication {
    public static void main(String[] args) {
        Input userInput = new UserInput();
        Output systemOutput = new SystemOutput();
        GameBoard gameBoard = new GameBoard(userInput, systemOutput);
    }
}
