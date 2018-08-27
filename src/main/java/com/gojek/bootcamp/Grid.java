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

    public void inserCellDead(int xPoint, int yPoint) {
        Cell cell = new Cell(xPoint, yPoint);
        cell.markDead();
        String key = getMapKey(xPoint, yPoint);
        gridCells.remove(key, cell);
        updateIndexIfRequired(xPoint, yPoint);
    }
    private void updateIndexIfRequired(int xPoint, int yPoint) {
        if (xPoint < minIndex){
            minIndex = xPoint;
        }else if (yPoint < minIndex){
            minIndex = yPoint;
        }

        if (xPoint > maxIndex){
            maxIndex = xPoint;
        }else if (yPoint > maxIndex){
            maxIndex = yPoint;
        }
    }

    private String getMapKey(int xPoint, int yPoint) {
        return "" + xPoint + "#" + yPoint;
    }

    public int getMinIndex() {
        return minIndex;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public boolean isCellAlive(int xPoint, int yPoint) {
        String key = getMapKey(xPoint, yPoint);
        return gridCells.containsKey(key) && gridCells.get(key).isStateAlive();
    }

}
