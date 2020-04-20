package org.academiadecodigo.rhastafaris.dapainter;

import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

    private DaPainter daPainter;

    public KeyboardController(DaPainter daPainter) {
        this.daPainter = daPainter;
        keyboardInit();
    }

    public void keyboardInit() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
/**
 * actions DaPainter can do:
 */
        KeyboardEvent pPressed = new KeyboardEvent();
        pPressed.setKey(KeyboardEvent.KEY_P);
        pPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent oPressed = new KeyboardEvent();
        oPressed.setKey(KeyboardEvent.KEY_O);
        oPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent kPressed = new KeyboardEvent();
        kPressed.setKey(KeyboardEvent.KEY_K);
        kPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent lPressed = new KeyboardEvent();
        lPressed.setKey(KeyboardEvent.KEY_L);
        lPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        KeyboardEvent onePressed = new KeyboardEvent();
        onePressed.setKey(KeyboardEvent.KEY_1);
        onePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent twoPressed = new KeyboardEvent();
        twoPressed.setKey(KeyboardEvent.KEY_2);
        twoPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent threePressed = new KeyboardEvent();
        threePressed.setKey(KeyboardEvent.KEY_3);
        threePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(upPressed);
        keyboard.addEventListener(downPressed);
        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(pPressed);
        keyboard.addEventListener(oPressed);
        keyboard.addEventListener(kPressed);
        keyboard.addEventListener(lPressed);
        keyboard.addEventListener(onePressed);
        keyboard.addEventListener(twoPressed);
        keyboard.addEventListener(threePressed);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                daPainter.moveCursor(DaPainter.Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                daPainter.moveCursor(DaPainter.Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                daPainter.moveCursor(DaPainter.Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                daPainter.moveCursor(DaPainter.Direction.RIGHT);
                break;
            case KeyboardEvent.KEY_P:
                daPainter.paintCell();
                break;
            case KeyboardEvent.KEY_O:
                daPainter.grid.resetGrid();
                break;
            case KeyboardEvent.KEY_K:
                daPainter.save();
                break;
                case KeyboardEvent.KEY_L:
                daPainter.load();
                break;

            case KeyboardEvent.KEY_1:
                daPainter.changeColor(Color.RED);
                Sound red = new Sound("/resources/red.wav");
                red.play(true);
                break;
            case KeyboardEvent.KEY_2:
                daPainter.changeColor(Color.CYAN);
                Sound blue = new Sound("/resources/blue.wav");
                blue.play(true);
                break;
            case KeyboardEvent.KEY_3:
                daPainter.changeColor(Color.BLACK);
                Sound black = new Sound("/resources/black.wav");
                black.play(true);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
