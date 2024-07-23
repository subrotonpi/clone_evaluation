private XSSFFont transform (XSSFWorkbook workbookNew, HSSFFont fontOld) {

    XSSFFont X1 = workbookNew.createFont ();

    X1.setBoldweight (fontOld.getBoldweight ());

    X1.setCharSet (fontOld.getCharSet ());

    X1.setColor (fontOld.getColor ());

    X1.setFontName (fontOld.getFontName ());

    X1.setFontHeight (fontOld.getFontHeight ());

    X1.setItalic (fontOld.getItalic ());

    X1.setStrikeout (fontOld.getStrikeout ());

    X1.setTypeOffset (fontOld.getTypeOffset ());

    X1.setUnderline (fontOld.getUnderline ());

    return X1;

}
