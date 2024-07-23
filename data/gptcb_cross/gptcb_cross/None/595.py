def actionPerformed(e):
    c = label.getBackground()
    if c == FLASH_COLOR:
        label.setBackground(None)
        label.setForeground(Color.black)
    else:
        label.setBackground(FLASH_COLOR)
        label.setForeground(Color.white)