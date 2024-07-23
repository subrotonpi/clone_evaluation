private HSSFFont transform (HSSFWorkbook workbookNew, XSSFFont X1) {

    HSSFFont fontNew = workbookNew.createFont ();

    fontNew.setBoldweight (X1.getBoldweight ());

    fontNew.setCharSet (X1.getCharSet ());

    fontNew.setColor (X1.getColor ());

    fontNew.setFontName (X1.getFontName ());

    fontNew.setFontHeight (X1.getFontHeight ());

    fontNew.setItalic (X1.getItalic ());

    fontNew.setStrikeout (X1.getStrikeout ());

    fontNew.setTypeOffset (X1.getTypeOffset ());

    fontNew.setUnderline (X1.getUnderline ());

    return fontNew;

}
