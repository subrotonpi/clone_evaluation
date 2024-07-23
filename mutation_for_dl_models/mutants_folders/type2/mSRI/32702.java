public void mouseMoved (MouseEvent e) {

    X1 = getX ();

    if (X1 < 0) {

        polyrot --;

    } else if (X1 > 0) {

        polyrot ++;

    }

    repaint ();

    break;

}
