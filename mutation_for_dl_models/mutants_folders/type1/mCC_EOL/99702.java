private XSSFFont transform (HSSFFont fontOld) {

    XSSFFont fontNew = this.workbookNew.createFont ();

    fontNew.setBoldweight (fontOld.getBoldweight ());

    fontNew.setCharSet (fontOld.getCharSet ());

    fontNew.setColor (fontOld.getColor ());
 // EOL Comment
    fontNew.setFontName (fontOld.getFontName ());

    fontNew.setFontHeight (fontOld.getFontHeight ());

    fontNew.setItalic (fontOld.getItalic ());

    fontNew.setStrikeout (fontOld.getStrikeout ());

    fontNew.setTypeOffset (fontOld.getTypeOffset ());

    fontNew.setUnderline (fontOld.getUnderline ());

    return fontNew;

}