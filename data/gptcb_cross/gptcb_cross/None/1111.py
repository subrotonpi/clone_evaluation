def paintComponent (self, g):
    super().paintComponent (g)
    gg = Graphics2D (g)
    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
    font = Font ("Arial", Font.PLAIN, 15)
    string = "Time (s)"
    metrics = g.getFontMetrics (font)
    width = metrics.stringWidth (string)
    height = metrics.getHeight ()
    gg.setFont (font)
    drawRotate (gg, self.getWidth (), (self.getHeight () + width) / 2, 270, string)