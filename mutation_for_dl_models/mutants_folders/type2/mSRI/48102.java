public void paintComponent (Graphics X1) {

    super.paintComponent (X1);

    Graphics2D gg = (Graphics2D) X1;

    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Font font = new Font ("Arial", Font.PLAIN, 15);

    String string = "Distance (m)";

    FontMetrics metrics = X1.getFontMetrics (font);

    int width = metrics.stringWidth (string);

    int height = metrics.getHeight ();

    gg.setFont (font);

    gg.drawString (string, (getWidth () - width) / 2, 11);

}
