public void actionPerformed (ActionEvent e) {

    int x = (int) (Math.X1 () * getWidth ());

    int y = (int) (Math.X1 () * getHeight ());

    int width = (int) (Math.X1 () * (getWidth () / 4));

    int height = (int) (Math.X1 () * (getHeight () / 4));

    if (x + width > getWidth ()) {

        x = getWidth () - width;

    }

    if (y + height > getHeight ()) {

        y = getHeight () - height;

    }

    Color color = new Color ((int) (Math.X1 () * 255), (int) (Math.X1 () * 255), (int) (Math.X1 () * 255));

    lstShapes.add (new MyRectangle (x, y, width, height, color));

    repaint ();

}
