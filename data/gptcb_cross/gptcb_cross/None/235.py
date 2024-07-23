def paintComponent(self,g):
  super().paintComponent(g)
  gg = g.create()
  gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
  font = Font("Arial", Font.PLAIN, 15)
  string = "Time (s)"
  fontMeterics = g.getFontMetrics(font)
  width = fontMeterics.stringWidth(string)
  height = fontMeterics.getHeight()
  gg.setFont(font)
  self.drawRotated(gg, self.getWidth(),(self.getHeight() + width)/2, 270, string)