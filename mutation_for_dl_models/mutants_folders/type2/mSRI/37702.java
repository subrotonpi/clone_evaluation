protected void paintComponent (Graphics g) {

    Graphics2D X1 = (Graphics2D) g;

    Graphics2D imgG2 = img.createGraphics ();

    imgG2.setBackground (new Color (0, 0, 0, 0));

    imgG2.setColor (Color.red);

    imgG2.fillRect (0, 0, 100, 100);

    imgG2.clearRect (0, 0, 50, 50);

    imgG2.dispose ();

    X1.drawImage (img, 0, 0, null);

    X1.dispose ();

    super.paintComponent (g);

}
