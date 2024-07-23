public void actionPerformed (ActionEvent e) {

    long X1 = System.currentTimeMillis () - startTime;

    float progress = (float) X1 / (float) RUN_TIME;

    if (progress > 1f) {

        progress = 1f;

        ((Timer) e.getSource ()).stop ();

    }

    ballPoint = new Point ();

    ballPoint.x = getWidth () / 2;

    ballPoint.y = Math.round (getHeight () * progress);

    repaint ();

}
