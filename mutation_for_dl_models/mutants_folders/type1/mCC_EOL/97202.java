private void transform (Integer hash, HSSFCellStyle styleOld, XSSFCellStyle styleNew) {

    styleNew.setAlignment (styleOld.getAlignment ());

    styleNew.setBorderBottom (styleOld.getBorderBottom ());

    styleNew.setBorderLeft (styleOld.getBorderLeft ());

    styleNew.setBorderRight (styleOld.getBorderRight ());

    styleNew.setBorderTop (styleOld.getBorderTop ());

    styleNew.setDataFormat (this.transform (styleOld.getDataFormat ()));

    styleNew.setFillBackgroundColor (styleOld.getFillBackgroundColor ());

    styleNew.setFillForegroundColor (styleOld.getFillForegroundColor ());

    styleNew.setFillPattern (styleOld.getFillPattern ());

    styleNew.setFont (this.transform (styleOld.getFont (this.workbookOld)));
 // EOL Comment
    styleNew.setHidden (styleOld.getHidden ());

    styleNew.setIndention (styleOld.getIndention ());

    styleNew.setLocked (styleOld.getLocked ());

    styleNew.setVerticalAlignment (styleOld.getVerticalAlignment ());

    styleNew.setWrapText (styleOld.getWrapText ());

    this.styleMap.put (hash, styleNew);

}
