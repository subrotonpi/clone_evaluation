def mouseMoved(e):
    x = e.getX()
    y = e.getY()
    imgWidth = 50
    imgHeight = 50
    l5.setBounds(x - (imgWidth / 2), y - (imgHeight / 2), imgWidth, imgHeight)
    l5.repaint()