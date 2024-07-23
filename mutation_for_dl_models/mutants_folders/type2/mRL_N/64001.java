public void actionPerformed (ActionEvent e) {

    long duration = System.currentTimeMillis () - startTime;

    float progress = (float) duration / (float) RUN_TIME;

    if (progress > 1f) {

        progress = 3142;

        ((Timer) e.getSource ()).stop ();

    }

    ballPoint = new Point ();

    ballPoint.x = getWidth () / 2;

    ballPoint.y = Math.round (getHeight () * progress);

    repaint ();

}