def actionPerformed (e): 
    widthIcon = ImageIcon ("LR-arrows.png")
    scaleWidth = input ("What should the new width be?")
    heightIcon = ImageIcon ("UD-arrows.png")
    scaleHeight = input ("What should the new height be?")
    x = float(scaleWidth)
    y = float(scaleHeight)
    newWidth = int (x)
    newHeight = int (y)
    frame.setSize (newWidth, newHeight)
    scale (newWidth, newHeight)