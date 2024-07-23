public void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D gg = (Graphics2D) g;

    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Font font = new Font ("Arial", Font.PLAIN, 15);

    String string = "Time (s)";

    FontMetrics metrics = g.getFontMetrics (font);

    int width = metrics.stringWidth (string);

    int height = metrics.X1 ();

    gg.setFont (font);

    drawRotate (gg, getWidth (), (X1 () + width) / 2, 270, string);

}
