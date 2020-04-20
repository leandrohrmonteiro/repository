package org.academiadecodigo.rhastafaris.dapainter;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;
    private int columns;
    private int rows;
    private Cell[][] cells;

    public Grid(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        //Step 1: Build the Canvas - Canvas is pointless if you tell the cells number of cols and rows...
       /* Rectangle canvas = new Rectangle(PADDING, PADDING, columns * CELL_SIZE, rows * CELL_SIZE);
        canvas.setColor(Color.CYAN);
        canvas.draw();*/
        populate();

    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Cell getCells(int columns, int rows) {
        return cells[columns][rows];
    }

    //Step 2: Populate Canvas with cells:
    private void populate() {
        cells = new Cell[columns][rows];
        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {
                cells[col][row] = new Cell(col, row);
            }
        }
    }

    public void resetGrid() {
        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {
                cells[col][row].erase();
            }
        }
    }

    public void stringToGrid(String grid) {
        int index = 0;

        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {

                Cell cell = cells[col][row];

                switch (grid.charAt(index)) {
                    case 'B':
                        cell.restoreColor('B');
                        break;
                    case 'C':
                        cell.restoreColor('C');
                        break;
                    case 'R':
                        cell.restoreColor('R');
                        break;
                    default:
                        cell.erase();
                }


                index++;
            }
            index++;
        }
    }

    @Override
    public String toString() {

        StringBuilder strBuilder = new StringBuilder();
        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < rows; row++) {
                strBuilder.append(cells[col][row]);
            }
            strBuilder.append("\n");
        }

        return strBuilder.toString();

    }

}
