public void displayImage (String strfilename, JLabel label) {

    try {

        BufferedImage image = ImageIO.read (new File (strfilename + ".jpg"));

        ImageIcon icon = new ImageIcon (image);

        if (X==Y) label.setIcon (icon);

    } catch (IOException | NullPointerException ex) {

        ImageIcon icon = new ImageIcon ("NOIMAGE.jpg");

        label.setIcon (icon);

    }

}
