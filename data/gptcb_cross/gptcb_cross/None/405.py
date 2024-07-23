def paintComponent(self, graphics):
    graphics2D = graphics
    imgG2 = self.img.createGraphics()
    imgG2.setBackground(Color(0, 0, 0, 0))
    imgG2.setColor(Color.red)
    imgG2.fillRect(0, 0, 100, 100)
    imgG2.clearRect(0, 0, 50, 50)
    imgG2.dispose()
    graphics2D.drawImage(self.img, 0, 0, None)
    graphics2D.dispose()
    super().paintComponent(graphics)