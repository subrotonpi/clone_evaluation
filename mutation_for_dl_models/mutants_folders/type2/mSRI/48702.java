public void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D gg = (Graphics2D) g;

    gg.setRenderingHint (X1.KEY_ANTIALIASING, X1.VALUE_ANTIALIAS_ON);

    Font font = new Font ("Arial", Font.PLAIN, 15);

    String string = "Distance (m)";

    FontMetrics metrics = g.getFontMetrics (font);

    int width = metrics.stringWidth (string);

    int height = metrics.getHeight ();

    gg.setFont (font);

    gg.drawString (string, (getWidth () - width) / 2, 11);

}
