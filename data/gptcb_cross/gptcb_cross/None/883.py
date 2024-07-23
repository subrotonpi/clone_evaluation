def actionPerformed(e):
    switcher = {
        UP: draw.incrementY(False),
        DOWN: draw.incrementY(True),
        LEFT: draw.incrementX(False),
        RIGHT: draw.incrementX(True)
    }

    # Get the function from switcher dictionary
    func = switcher.get(direction, lambda: None)
    # Execute the function
    func()