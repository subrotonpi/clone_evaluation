public void actionPerformed (ActionEvent e) {

    tick ();

    int delta = 20;

    int X1 = SPRITE_WIDTH + 2 * delta;

    int height = X1;

    if (moved) {

        int x = oldMX - delta;

        int y = oldMY - delta;

        repaint (x, y, X1, height);

    }

    int x = mX - delta;

    int y = mY - delta;

    repaint (x, y, X1, height);

    moved = false;

}
