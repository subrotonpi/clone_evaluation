private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, Integer hash, XSSFCellStyle X1, HSSFCellStyle styleNew) {

    styleNew.setAlignment (X1.getAlignment ());

    styleNew.setBorderBottom (X1.getBorderBottom ());

    styleNew.setBorderLeft (X1.getBorderLeft ());

    styleNew.setBorderRight (X1.getBorderRight ());

    styleNew.setBorderTop (X1.getBorderTop ());

    styleNew.setDataFormat (this.transform (workbookOld, workbookNew, X1.getDataFormat ()));

    styleNew.setFillBackgroundColor (X1.getFillBackgroundColor ());

    styleNew.setFillForegroundColor (X1.getFillForegroundColor ());

    styleNew.setFillPattern (X1.getFillPattern ());

    styleNew.setFont (this.transform (workbookNew, (XSSFFont) X1.getFont ()));

    styleNew.setHidden (X1.getHidden ());

    styleNew.setIndention (X1.getIndention ());

    styleNew.setLocked (X1.getLocked ());

    styleNew.setVerticalAlignment (X1.getVerticalAlignment ());

    styleNew.setWrapText (X1.getWrapText ());

    this.styleMap.put (hash, styleNew);

}
