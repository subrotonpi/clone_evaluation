public void mouseDragged (X1,MouseEvent me) {

    super.mouseDragged (me);

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
