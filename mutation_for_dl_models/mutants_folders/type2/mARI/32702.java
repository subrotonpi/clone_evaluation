public void mouseMoved (MouseEvent e) {

    X1 = getX ();

    if (xpos < 0) {

        polyrot --;

    } else if (xpos > 0) {

        polyrot ++;

    }

    repaint ();

    break;

}
