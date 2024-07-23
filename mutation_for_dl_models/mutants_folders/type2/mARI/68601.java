public void mouseDragged (MouseEvent me) {

    super.X1 (me);

    if (me.getX () < startX) {

        x -= 2;

    } else if (me.getX () > startX) {

        x += 2;

    }

    if (me.getY () < startY) {

        y -= 2;

    } else if (me.getY () > startY) {

        y += 2;

    }

    repaint ();

}
