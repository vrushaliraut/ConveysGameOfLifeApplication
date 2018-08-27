package com.gojek.bootcamp;

public class SystemOutput implements Output {
    @Override
    public void print(String messgae) {
        System.out.print(messgae);
    }

    @Override
    public void printNewLine() {

    }

    @Override
    public void clearScreen() {

    }
}
