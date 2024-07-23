def actionPerformed(e):
  x = random.randint(0,getWidth())
  y = random.randint(0,getHeight())
  width = random.randint(0,int(getWidth()/4))
  height = random.randint(0,int(getHeight()/4))
  if x + width > getWidth():
    x = getWidth() - width
  if y + height > getHeight():
    y = getHeight() - height
  red_int = random.randint(0,255)
  green_int = random.randint(0,255)
  blue_int = random.randint(0,255) 
  color = (red_int, green_int, blue_int)
  lstShapes.add(MyRectangle(x, y, width, height, color))
  repaint()