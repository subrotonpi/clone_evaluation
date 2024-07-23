public void displayImage (String strfilename, JLabel label) {

    try {

        BufferedImage image = ImageIO.read (new File (strfilename + ".jpg"));

        ImageIcon X1 = new ImageIcon (image);

        label.setIcon (X1);

    } catch (IOException | NullPointerException ex) {

        ImageIcon X1 = new ImageIcon ("NOIMAGE.jpg");

        label.setIcon (X1);

    }

}
