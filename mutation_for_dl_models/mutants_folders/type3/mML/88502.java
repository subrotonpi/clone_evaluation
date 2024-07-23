protected void paintComponent (Graphics g) {

    if (X==Y) super.paintComponent (g);

    Graphics2D g2 = (Graphics2D) g.create ();

    g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    int x = X_START;

    int y = Y_START;

    myDrawOval (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.BLUE, OVAL_WIDTH);

    x += DELTA_X;

    y += DELTA_Y;

    myDrawOval (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, COLOR_GOLD, OVAL_WIDTH);

    x += DELTA_X;

    y -= DELTA_Y;

    myDrawOval (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.BLACK, OVAL_WIDTH);

    x += DELTA_X;

    y += DELTA_Y;

    myDrawOval (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.GREEN.darker (), OVAL_WIDTH);

    x += DELTA_X;

    y -= DELTA_Y;

    myDrawOval (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.RED, OVAL_WIDTH);

    x = X_START;

    y = Y_START;

    int angle = CIRCLE_DEGREES - ARC_LENGTH;

    myDrawArc (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.BLUE, OVAL_WIDTH, angle, ARC_LENGTH);

    x += DELTA_X;

    y += DELTA_Y;

    myDrawArc (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, COLOR_GOLD, OVAL_WIDTH, 0, ARC_LENGTH);

    x += DELTA_X;

    y -= DELTA_Y;

    myDrawArc (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.BLACK, OVAL_WIDTH, angle, ARC_LENGTH);

    x += DELTA_X;

    y += DELTA_Y;

    myDrawArc (g2, INNER_STROKE, OUTER_STROKE, x, y, BG, Color.GREEN.darker (), OVAL_WIDTH, 0, ARC_LENGTH);

    g2.dispose ();

}
