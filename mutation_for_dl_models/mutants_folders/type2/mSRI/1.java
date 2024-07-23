public static BufferedImage scale (BufferedImage X1, int dWidth, int dHeight) {

    BufferedImage scaledImage = null;

    if (X1 != null) {

        scaledImage = new BufferedImage (dWidth, dHeight, X1.getType ());

        Graphics2D graphics2D = scaledImage.createGraphics ();

        graphics2D.drawImage (X1, 0, 0, dWidth, dHeight, null);

        graphics2D.dispose ();

    }

    return scaledImage;

}
