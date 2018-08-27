package com.gojek.bootcamp;

public class SystemOutput implements Output {
    @Override
    public void print(String messgae) {
        System.out.print(messgae);
    }

    @Override
    public void printNewLine() {
        System.out.println();
    }

    @Override
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
