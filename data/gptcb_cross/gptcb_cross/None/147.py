def actionPerformed(e):
    x = random.randint(0, getWidth())
    y = random.randint(0, getHeight())
    width = random.randint(0, getWidth()/4)
    height = random.randint(0, getHeight()/4)
    if (x + width > getWidth()):
        x = getWidth() - width
    if (y + height > getHeight()):
        y = getHeight() - height
    color = (random.randint(0,255), random.randint(0,255), random.randint(0,255))
    lstShapes.append(MyRectangle(x, y, width, height, color))
    repaint()