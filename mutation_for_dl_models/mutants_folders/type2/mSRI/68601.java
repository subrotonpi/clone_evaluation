public void mouseDragged (MouseEvent X1) {

    super.mouseDragged (X1);

    if (X1.getX () < startX) {

        x -= 2;

    } else if (X1.getX () > startX) {

        x += 2;

    }

    if (X1.getY () < startY) {

        y -= 2;

    } else if (X1.getY () > startY) {

        y += 2;

    }

    repaint ();

}
