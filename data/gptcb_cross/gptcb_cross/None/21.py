def actionPerformed(e):
    duration = System.currentTimeMillis() - startTime
    progress = duration / RUN_TIME
    linePoint = Point()
    linePoint.x = getWidth() / 2
    if progress < 0.5f:
        linePoint.y = int(round(getHeight() * (progress *2)))
    else:
        if progress > 1f:
            progress = 1f
            e.getSource().stop()
            linePoint = None
            ballPoint = None
        else:
            linePoint.y = int(round(getHeight() * (progress *2)))
            linePoint.y = getHeight() - (linePoint.y - getHeight())
            ballPoint.y = linePoint.y
    repaint()