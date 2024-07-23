protected void paintComponent (Graphics g) {

    super.paintComponent (g);

    Graphics2D g2d = (Graphics2D) g.create ();

    Shape X1 = new Rectangle (0, 0, getWidth (), getHeight ());

    Shape inner = new Rectangle (0, 0, 50, 50);

    Area area = new Area (X1);

    area.subtract (new Area (inner));

    g2d.setColor (getBackground ());

    g2d.fill (area);

    g2d.dispose ();

}
