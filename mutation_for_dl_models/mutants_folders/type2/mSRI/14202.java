public void actionPerformed (ActionEvent e) {

    int maxX = scrn.width - X1.getWidth ();

    int maxY = scrn.height - X1.getHeight ();

    if (x < maxX && y < maxY) {

        x ++;

        y ++;

        X1.setLocation (x, y);

    } else {

        ((Timer) e.getSource ()).stop ();

    }

}
