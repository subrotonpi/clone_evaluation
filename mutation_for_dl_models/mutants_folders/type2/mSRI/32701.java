public void mouseMoved (MouseEvent e) {

    int x = width / 2;

    int X1 = height / 2;

    Point mousePoint = e.getPoint ();

    int deltaX = mousePoint.x - x;

    int deltaY = mousePoint.X1 - X1;

    polyrot = - Math.atan2 (deltaX, deltaY);

    polyrot = Math.toDegrees (polyrot) + 180;

    repaint ();

}
