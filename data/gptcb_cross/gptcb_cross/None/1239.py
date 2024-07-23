def paintComponent (self, g):
    super().paintComponent (g)
    font = Font("Arial", Font.BOLD, 48)
    text = "Along time ago, in a galaxy, far, far away"
    outline = font.createGlyphVector (g.getFontMetrics ().getFontRenderContext (), text).getOutline ()
    transform = AffineTransform.getTranslateInstance (- outline.getBounds ().getX () + self.getWidth () / 2 - outline.getBounds ().width / 2, - outline.getBounds ().getY () + self.getHeight () / 2 - outline.getBounds ().height / 2)
    outline = transform.createTransformedShape (outline)
    g2d.fill (outline)