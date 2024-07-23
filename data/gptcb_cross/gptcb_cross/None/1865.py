def mouseMoved(e):
  xpos = getX()
  if xpos < 0:
    polyrot -= 1
  elif xpos > 0:
    polyrot += 1
  repaint()
  break