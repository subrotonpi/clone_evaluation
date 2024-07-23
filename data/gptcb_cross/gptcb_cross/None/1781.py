def getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col):
    c = super().getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col)
    c.setBackground (Color.WHITE)
    c.setForeground (Color.BLACK)
    l = super().getTableCellRendererComponent (table, value, isSelected, hasFocus, row, col)
    if separatedVariable == "YOUR VALUE TO GREEN":
        l.setBackground (Color.GREEN)
        return l
    else:
        if separatedValue == "YOUR VALUE TO YELLOW":
            l.setBackground (Color.YELLOW)
            return l
        elif separatedValue == "YOUR VALUE TO RED":
            l.setBaground (Color.RED)
            return l
    
    return c