public void mouseDragged (MouseEvent me) {

    super.mouseDragged ();

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
