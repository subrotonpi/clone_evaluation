def actionPerformed(e):
    if direction == 'UP':
        draw.incrementY(False)
    elif direction == 'DOWN':
        draw.incrementY(True)
    elif direction == 'LEFT':
        draw.incrementX(False)
    elif direction == 'RIGHT':
        draw.incrementX(True)
    else:
        pass