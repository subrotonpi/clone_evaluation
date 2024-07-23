public static BufferedImage scale (BufferedImage sbi, int imageType, int dWidth, int dHeight, double X1, double fHeight) {

    BufferedImage dbi = null;

    if (sbi != null) {

        dbi = new BufferedImage (dWidth, dHeight, imageType);

        Graphics2D g = dbi.createGraphics ();

        AffineTransform at = AffineTransform.getScaleInstance (X1, fHeight);

        g.drawRenderedImage (sbi, at);

    }

    return dbi;

}
