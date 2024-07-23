def run():
    l = label.Label(image.ImageIcon(bi))
    two_part_border = borders.CompoundBorder(borders.EmptyBorder(15, 15, 15, 15), borders.EtchedBorder())
    three_part_border = borders.CompoundBorder(two_part_border, borders.EmptyBorder(15, 15, 15, 15))
    l.border = three_part_border
    f = window.Window("Three Part Border")
    f.defaultCloseOperation = window.Window.DISPOSE_ON_CLOSE
    f.contentPane = l
    f.pack()
    f.locationByPlatform = True
    f.visible = True