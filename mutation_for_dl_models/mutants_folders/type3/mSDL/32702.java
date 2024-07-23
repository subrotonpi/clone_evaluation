public void mouseMoved () {

    xpos = getX ();

    if (xpos < 0) {

        polyrot --;

    } else if (xpos > 0) {

        polyrot ++;

    }

    repaint ();

    break;

}
