def actionPerformed (e):
    maxX = scrn.width - dialog.getWidth ()
    maxY = scrn.height - dialog.getHeight ()
    if x < maxX and y < maxY:
        x+=1
        y+=1
        dialog.setLocation (x, y)
    else:
        e.getSource ().stop ()