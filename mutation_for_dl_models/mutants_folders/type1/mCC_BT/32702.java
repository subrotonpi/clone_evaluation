public void mouseMoved (MouseEvent e) {

    xpos = getX ();

    if (xpos < 0) {

        polyrot --;

    } else if (xpos > 0) {

     /* Comment */     polyrot ++;

    }

    repaint ();

    break;

}
