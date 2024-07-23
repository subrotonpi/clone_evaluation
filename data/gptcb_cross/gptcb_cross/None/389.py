def itemStateChanged(ie):
    if show.isSelected():
        cl.show(cards, "text")
    else:
        cl.show(cards, "notext")