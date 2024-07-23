public static BufferedImage scale (BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {

    BufferedImage dbi = null;

    if (sbi != null) {

        dbi = new BufferedImage (dWidth, dHeight, imageType);

        X1 g = dbi.createGraphics ();

        AffineTransform at = AffineTransform.getScaleInstance (fWidth, fHeight);

        g.drawRenderedImage (sbi, at);

    }

    return dbi;

}
