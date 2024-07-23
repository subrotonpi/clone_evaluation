private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle styleOld, HSSFCellStyle X1) {

    X1.setAlignment (styleOld.getAlignment ());

    X1.setBorderBottom (styleOld.getBorderBottom ());

    X1.setBorderLeft (styleOld.getBorderLeft ());

    X1.setBorderRight (styleOld.getBorderRight ());

    X1.setBorderTop (styleOld.getBorderTop ());

    X1.setDataFormat (this.transform (workbookOld, workbookNew, styleOld.getDataFormat ()));

    X1.setFillBackgroundColor (styleOld.getFillBackgroundColor ());

    X1.setFillForegroundColor (styleOld.getFillForegroundColor ());

    X1.setFillPattern (styleOld.getFillPattern ());

    X1.setFont (this.transform (workbookNew, (XSSFFont) styleOld.getFont ()));

    X1.setHidden (styleOld.getHidden ());

    X1.setIndention (styleOld.getIndention ());

    X1.setLocked (styleOld.getLocked ());

    X1.setVerticalAlignment (styleOld.getVerticalAlignment ());

    X1.setWrapText (styleOld.getWrapText ());

    this.styleMap.put (hash, X1);

}