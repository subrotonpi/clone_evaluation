def actionPerformed (self, e):
    x = randint(0, self.getWidth())
    y = randint(0, self.getHeight())
    width = randint(0, int(self.getWidth() / 4))
    height = randint(0, int(self.getHeight() / 4))

    if (x + width > getWidth()):
        x = self.getWidth() - width
    if (y + height > getHeight()):
        y = self.getHeight() - height

    color = Color(randint(0, 255), randint(0, 255), randint(0, 255))
    self.lstShapes.add(MyRectangle(x, y, width, height, color))
    self.repaint()