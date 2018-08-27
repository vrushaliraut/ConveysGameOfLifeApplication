package com.gojek.bootcamp;

import java.util.HashMap;

public class Grid {

    private int minIndex;
    private int maxIndex;
    private HashMap<String, Cell> gridCells;

    public Grid() {
        gridCells = new HashMap<String, Cell>();
        this.maxIndex = this.minIndex = 0;
    }

    public void insertAliveCell(int xPoint, int yPoint) {
        Cell cell = new Cell(xPoint, yPoint);
        cell.markAlive();
        String key = getMapKey(xPoint, yPoint);
        gridCells.put(key, cell);
        updateIndexIfRequired(xPoint, yPoint);
    }

    private void updateIndexIfRequired(int xPoint, int yPoint) {

    }

    private String getMapKey(int xPoint, int yPoint) {
        return null;
    }
}