def actionPerformed(ae):
    if ae.getSource() == select:
        activeTool = SELECTION_TOOL
    elif ae.getSource() == draw:
        activeTool = DRAW_TOOL
    elif ae.getSource() == text:
        activeTool = TEXT_TOOL