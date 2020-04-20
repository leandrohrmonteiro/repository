package org.academiadecodigo.rhastafaris.dapainter;


/*
    1. draw canvas - DONE
    2. create grid/cells/squares - DONE
    3. create cursor - DONE
    4. create input handler - DONE -see how ou can use Strategy pattern in this case!!!!!
    5. move cursor - DONE
    6. paint - DONE (p key)
    6.1 paint using cursor color - DONE
    6.2 paint in different colors - DONE
    6.3 says name of color when changing into that color - DONE
    7. toggle cell - DONE
    7.1 reset grid - DONE (o key)
    8. save to file
    9. load from file
    10. quit
 */

import org.academiadecodigo.bootcamp.Sound;

public class Main {
    public static void main(String[] args) {

        DaPainter daPainter = new DaPainter(30, 30);
        KeyboardController keyboardController = new KeyboardController(daPainter);

    }

}
