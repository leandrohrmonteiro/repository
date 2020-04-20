package org.academiadecodigo.rhastafaris.dapainter;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.rhastafaris.dapainter.Grid.CELL_SIZE;
import static org.academiadecodigo.rhastafaris.dapainter.Grid.PADDING;

public class Cell {

    private int column;
    private int row;
    Rectangle cell;
    private boolean painted;
    private Color colorPainted;


    public Cell(int column, int row) {
        this.column = column;
        this.row = row;
        cell = new Rectangle(column * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
        cell.setColor(Color.WHITE);
        cell.draw();
    }


    // should paint with color initial color before cursor color is changed by user
    public void paint(Color cursorColor) {
        painted = true;
        cell.setColor(cursorColor);
        cell.fill();
        colorPainted = cell.getColor();
        System.out.println(toString());

    }

    public void erase() {
        painted = false;
        cell.setColor(Color.WHITE);
        cell.fill();
        colorPainted = cell.getColor();

    }

    public void restoreColor(Character color) {
        switch (color){
            case 'B':
                cell.setColor(Color.BLACK);
                cell.fill();
                break;
            case 'C':
                cell.setColor(Color.CYAN);
                cell.fill();
                break;
            case 'R':
                cell.setColor(Color.RED);
                cell.fill();
                break;
            default:
                System.out.println("go check cell restoreColor method to fix this.");
                break;
        }
    }


    public boolean isPainted() {
        return painted;
    }


    @Override
    public String toString() {
        /**
         * SEE HOW TO DO SWITCH HERE!!!
          */
       /* switch (this.colorPainted.toString()){
            case (Color.BLACK.toString()):
        }*/

        if (this.colorPainted == Color.BLACK) {
            return "B";
        }
        if (this.colorPainted == Color.CYAN) {
            return "C";
        }
        if (this.colorPainted == Color.RED) {
            return "R";
        } else {
            return "W";
        }
    }

}
