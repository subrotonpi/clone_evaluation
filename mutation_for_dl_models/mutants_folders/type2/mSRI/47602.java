public void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D gg = (Graphics2D) g;

    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Font X1 = new Font ("Arial", Font.PLAIN, 15);

    String string = "Time (s)";

    FontMetrics metrics = g.getFontMetrics (X1);

    int width = metrics.stringWidth (string);

    int height = metrics.getHeight ();

    gg.setFont (X1);

    drawRotate (gg, getWidth (), (getHeight () + width) / 2, 270, string);

}
