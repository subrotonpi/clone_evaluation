def scale(sbi, imageType, dWidth, dHeight, fWidth, fHeight):
    dbi = None
    if sbi != None:
        dbi = BufferedImage(dWidth, dHeight, imageType)
        g = dbi.createGraphics()
        at = AffineTransform.getScaleInstance(fWidth, fHeight)
        g.drawRenderedImage(sbi, at)
    return dbi