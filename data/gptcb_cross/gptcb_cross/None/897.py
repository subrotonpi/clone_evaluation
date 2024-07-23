def move ():
    y += ya
    x += xa
    if (x < 0):
        x = 0
    elif (x + 30 > game.getWidth ()):
        x = game.getWidth () - 30
    if (y < 0):
        y = 0
    elif (collision ()):
        onGround = True
        y = game.ground.getBounds ().y - d