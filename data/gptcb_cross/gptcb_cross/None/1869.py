def paintComponent (self, g):
    super(self).paintComponent(g)
    gg = Graphics2D(g)
    gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
    font  = Font("Arial", Font.PLAIN, 15)
    string = "Distance (m)"
    metrics = g.getFontMetrics(font)
    width = metrics.stringWidth(string)
    height = metrics.getHeight()
    gg.setFont(font)
    gg.drawString(string, (self.getWidth() - width) / 2, 11)