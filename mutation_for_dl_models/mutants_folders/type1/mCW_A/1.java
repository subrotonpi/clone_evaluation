public static BufferedImage scale (BufferedImage  imageToScale, int dWidth, int dHeight) {

    BufferedImage scaledImage = null;

    if (imageToScale != null) {

        scaledImage = new BufferedImage (dWidth, dHeight, imageToScale.getType ());

        Graphics2D graphics2D = scaledImage.createGraphics ();

        graphics2D.drawImage (imageToScale, 0, 0, dWidth, dHeight, null);

        graphics2D.dispose ();

    }

    return scaledImage;

}
