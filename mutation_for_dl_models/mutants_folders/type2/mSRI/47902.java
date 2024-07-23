public void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D gg = (Graphics2D) g;

    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    Font font = new Font ("Arial", Font.PLAIN, 15);

    String string = "Distance (m)";

    FontMetrics X1 = g.getFontMetrics (font);

    int width = X1.stringWidth (string);

    int height = X1.getHeight ();

    gg.setFont (font);

    gg.drawString (string, (getWidth () - width) / 2, 11);

}
