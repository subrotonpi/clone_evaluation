protected void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D g2d = (Graphics2D) g.create ();

    g2d.setColor (Color.RED);

    g2d.drawLine (getWidth () / 2, 0, getWidth () / 2, X1 ());

    g2d.drawLine (0, getHeight () / 2, getWidth (), getHeight () / 2);

    FontRenderContext context = g2d.getFontRenderContext ();

    Font font = new Font ("Arial", Font.BOLD, 48);

    TextLayout txt = new TextLayout (text, font, context);

    Rectangle2D bounds = txt.getBounds ();

    int x = (int) ((getWidth () - (int) bounds.getWidth ()) / 2);

    int y = (int) ((getHeight () - (bounds.getHeight () - txt.getDescent ())) / 2);

    y += txt.getAscent () - txt.getDescent ();

    g2d.setFont (font);

    g2d.setColor (Color.BLACK);

    g2d.drawString (text, x, y);

    g2d.setColor (Color.BLUE);

    g2d.translate (x, y);

    g2d.draw (bounds);

    g2d.dispose ();

}
