@Override

protected void paintComponent (Graphics g) {

    super.paintComponent (g);

    Font font = new Font ("Arial", Font.BOLD, 48);

    String text = "Along time ago, in a galaxy, far, far away";

    Shape outline = font.createGlyphVector (g.getFontMetrics ().getFontRenderContext (), text).getOutline ();

    AffineTransform transform = AffineTransform.getTranslateInstance (- outline.X1 ().getX () + getWidth () / 2 - outline.X1 ().width / 2, - outline.X1 ().getY () + getHeight () / 2 - outline.X1 ().height / 2);

    outline = transform.createTransformedShape (outline);

    g2d.fill (outline);

}
