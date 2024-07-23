public void actionPerformed (ActionEvent e) {

    int x = (int) (Math.random () * getWidth ());

    int y = (int) (Math.random () * getHeight ());

    int width = (int) (Math.random () * (getWidth () / 4));

    int X1 = (int) (Math.random () * (getHeight () / 4));

    if (x + width > getWidth ()) {

        x = getWidth () - width;

    }

    if (y + X1 > getHeight ()) {

        y = getHeight () - X1;

    }

    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));

    lstShapes.add (new MyRectangle (x, y, width, X1, color));

    repaint ();

}
