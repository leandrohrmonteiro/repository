package org.academiadecodigo.rhastafaris.dapainter;


import org.academiadecodigo.simplegraphics.graphics.Color;

public class DaPainter {

    Grid grid;
    Cursor cursor;


    public DaPainter(int columns, int rows) {
        this.grid = new Grid(columns, rows);
        this.cursor = new Cursor();

    }

    //Step 4 make the Cursor move:
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public void moveCursor(Direction direction) {

        //exception case for cursor on edge
        if (cursorOnEdge(direction)) {
            return;
        }

        switch (direction) {
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }
    }

    private boolean cursorOnEdge(Direction direction) {
        return direction == Direction.UP && cursor.getRow() == 0 ||
                direction == Direction.DOWN && cursor.getRow() == grid.getRows() - 1 ||
                direction == Direction.LEFT && cursor.getColumn() == 0 ||
                direction == Direction.RIGHT && cursor.getColumn() == grid.getColumns() - 1;
    }

    public void paintCell() {
        Cell cell = grid.getCells(cursor.getColumn(), cursor.getRow());

        //WORKS!!
        if (!cell.isPainted()) {
            cell.paint(cursor.getCursorColor());
        } else {
            cell.erase();
        }

        //cell.paint(cursor.getCursorColor());
    }

    public void changeColor(Color color) {
        cursor.setCursorColor(color);
    }

    public void save() {
        FileManager.writeFile(grid.toString());
    }

    public void load() {
        grid.stringToGrid(FileManager.readFile());
    }

}
