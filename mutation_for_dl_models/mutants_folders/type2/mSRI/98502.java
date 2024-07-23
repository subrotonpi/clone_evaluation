private void transform (Integer hash, HSSFCellStyle styleOld, XSSFCellStyle styleNew) {

    styleNew.setAlignment (styleOld.getAlignment ());

    styleNew.setBorderBottom (styleOld.getBorderBottom ());

    styleNew.setBorderLeft (styleOld.getBorderLeft ());

    styleNew.setBorderRight (styleOld.getBorderRight ());

    styleNew.setBorderTop (styleOld.getBorderTop ());

    styleNew.setDataFormat (X1.transform (styleOld.getDataFormat ()));

    styleNew.setFillBackgroundColor (styleOld.getFillBackgroundColor ());

    styleNew.setFillForegroundColor (styleOld.getFillForegroundColor ());

    styleNew.setFillPattern (styleOld.getFillPattern ());

    styleNew.setFont (X1.transform (styleOld.getFont (X1.workbookOld)));

    styleNew.setHidden (styleOld.getHidden ());

    styleNew.setIndention (styleOld.getIndention ());

    styleNew.setLocked (styleOld.getLocked ());

    styleNew.setVerticalAlignment (styleOld.getVerticalAlignment ());

    styleNew.setWrapText (styleOld.getWrapText ());

    X1.styleMap.put (hash, styleNew);

}
