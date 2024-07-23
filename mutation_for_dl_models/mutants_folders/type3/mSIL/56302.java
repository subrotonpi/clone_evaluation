public void actionPerformed (ActionEvent e) {

    int x = (int) (Math.random () * getWidth ());

    int y = (int) (Math.random () * getHeight ());

    int width = (int) (Math.random () * (getWidth () / 4));

    int height = (int) (Math.random () * (getHeight () / 4));

    if (x + width > getWidth ()) {

        x = getWidth () - width;

    }

    if (y + height > getHeight ()) {

        y = getHeight () - height;

    }

    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));

    lstShapes.add (new MyRectangle (x,X1, y, width, height, color));

    repaint ();

}
