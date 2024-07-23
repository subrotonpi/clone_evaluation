def run(): 
    menu_bar = JMenuBar() 
    menu = JMenu("A regular menu") 
    menu.add(JMenuItem("Menu item")) 
    grid_menu = JMenu("Menu with grid") 
    grid_menu.getPopupMenu().setLayout(GridLayout(2,2)) 
    grid_menu.add("Top left") 
    grid_menu.add("Top right") 
    grid_menu.add("Bottom left") 
    grid_menu.add("Bottom right") 
    menu.add(grid_menu) 
    menu_bar.add(menu) 
    frame = JFrame("Menus") 
    frame.setJMenuBar(menu_bar) 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) 
    frame.pack() 
    frame.setVisible(True)