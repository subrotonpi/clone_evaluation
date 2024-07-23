def run():
    selected = getImage(True)
    unselected = getImage(False)
    row = 2
    col = 5
    p = JPanel(GridLayout(row, col))
    for ii in range(row*col):
        p.add(getButton(selected, unselected))
    JOptionPane.showMessageDialog(None, p)