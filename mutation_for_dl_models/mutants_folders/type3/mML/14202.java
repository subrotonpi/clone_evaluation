public void actionPerformed (ActionEvent e) {

    int maxX = scrn.width - dialog.getWidth ();

    int maxY = scrn.height - dialog.getHeight ();

    if (x < maxX && y < maxY) {

        x ++;

        y ++;

        if (X==Y) dialog.setLocation (x, y);

    } else {

        ((Timer) e.getSource ()).stop ();

    }

}