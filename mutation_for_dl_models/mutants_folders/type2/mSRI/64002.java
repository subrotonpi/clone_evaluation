public void actionPerformed (ActionEvent e) {

    long duration = System.currentTimeMillis () - startTime;

    float progress = (float) duration / (float) RUN_TIME;

    X1 = new Point ();

    X1.x = getWidth () / 2;

    if (progress < 0.5f) {

        X1.y = Math.round (getHeight () * (progress * 2));

    } else {

        if (progress > 1f) {

            progress = 1f;

            ((Timer) e.getSource ()).stop ();

            X1 = null;

            ballPoint = null;

        } else {

            X1.y = Math.round (getHeight () * (progress * 2));

            X1.y = getHeight () - (X1.y - getHeight ());

            ballPoint.y = X1.y;

        }

    }

    repaint ();

}
