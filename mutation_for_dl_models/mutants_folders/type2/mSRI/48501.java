public void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D X1 = (Graphics2D) g;

    X1.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Font font = new Font ("Arial", Font.PLAIN, 15);

    String string = "Distance (m)";

    FontMetrics metrics = g.getFontMetrics (font);

    int width = metrics.stringWidth (string);

    int height = metrics.getHeight ();

    X1.setFont (font);

    X1.drawString (string, (getWidth () - width) / 2, 11);

}
