def actionPerformed(event): 
    x = random.randint(0, getWidth()) 
    y = random.randint(0, getHeight()) 
    width = random.randint(0, getWidth()/4) 
    height = random.randint(0, getHeight()/4) 
    if x + width > getWidth(): 
        x = getWidth() - width 
    if y + height > getHeight(): 
        y = getHeight() - height 
    r = random.randint(0, 255) 
    g = random.randint(0, 255) 
    b = random.randint(0, 255)
    color = (r, g, b) 
    lstShapes.add(MyRectangle(x, y, width, height, color)) 
    repaint()