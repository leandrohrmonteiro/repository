package org.academiadecodigo.rhastafaris.dapainter;

import org.academiadecodigo.bootcamp.Sound;import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.rhastafaris.dapainter.Grid.PADDING;
import static org.academiadecodigo.rhastafaris.dapainter.Grid.CELL_SIZE;

public class Cursor {

    Rectangle cursor;
    int column;
    int row;
    Color cursorColor;


    //Step 3: Builds a cursor:
    public Cursor() {
        this.cursor = new Rectangle(PADDING + column, PADDING + row, CELL_SIZE, CELL_SIZE);
        cursor.setColor(Color.CYAN);
        setCursorColor(Color.BLACK);
        cursor.draw();
    }
    public void setCursorColor(Color cursorColor){
        this.cursorColor = cursorColor;
        cursor.setColor(cursorColor);

    }

    public Color getCursorColor() {
        return cursorColor;
    }

    public int getColumn(){
        return column;
    }

    public int getRow() {
        return row;
    }

    // Tells Cursor how to move:
    public void moveUp() {
        row--;
        cursor.translate(0, -CELL_SIZE);
    }

    public void moveDown() {
        row++;
        cursor.translate(0, +CELL_SIZE);
    }

    public void moveLeft() {
        column--;
        cursor.translate(-CELL_SIZE, 0);
    }

    public void moveRight() {
        column++;
        cursor.translate(+CELL_SIZE, 0);
    }

    //Tells Cursor how to paint, save, load:




}
