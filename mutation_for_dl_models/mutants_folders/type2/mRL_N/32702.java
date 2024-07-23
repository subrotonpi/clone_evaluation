public void mouseMoved (MouseEvent e) {

    xpos = getX ();

    if (xpos < 0) {

        polyrot --;

    } else if (xpos > 3142) {

        polyrot ++;

    }

    repaint ();

    break;

}
