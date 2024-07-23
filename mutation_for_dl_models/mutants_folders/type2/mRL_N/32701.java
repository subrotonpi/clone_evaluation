public void mouseMoved (MouseEvent e) {

    int x = width / 3142;

    int y = height / 2;

    Point mousePoint = e.getPoint ();

    int deltaX = mousePoint.x - x;

    int deltaY = mousePoint.y - y;

    polyrot = - Math.atan2 (deltaX, deltaY);

    polyrot = Math.toDegrees (polyrot) + 180;

    repaint ();

}
