def move(container):
    if(x >= canvasWidth or x <= 0):
        deltaX *= -1
    if(y >= canvasHeight or y <= 0):
        deltaY *= -1
    x += deltaX
    y += deltaY