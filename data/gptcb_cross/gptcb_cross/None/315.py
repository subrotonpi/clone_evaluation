def paintComponent(self, g):
    super().paintComponent(g)
    g2d = g as Graphics2D
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                          RenderingHints.VALUE_ANTIALIAS_ON)
    font = Font('Arial', Font.PLAIN, 15)
    string = 'Time (s)'
    metrics = g.getFontMetrics(font)
    width = metrics.stringWidth(string)
    height = metrics.getHeight()
    g2d.setFont(font)
    self.drawRotate(g2d, self.getWidth(), (self.getHeight()+width)//2, 270, string)