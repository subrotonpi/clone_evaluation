private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFSheet sheetOld, HSSFSheet sheetNew) {

    System.out.println ("transform Sheet");

    sheetNew.setDisplayFormulas (sheetOld.X1 ());

    sheetNew.setDisplayGridlines (sheetOld.isDisplayGridlines ());

    sheetNew.setDisplayGuts (sheetOld.getDisplayGuts ());

    sheetNew.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());

    sheetNew.setDisplayZeros (sheetOld.isDisplayZeros ());

    sheetNew.setFitToPage (sheetOld.getFitToPage ());

    sheetNew.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());

    sheetNew.setMargin (Sheet.BottomMargin, sheetOld.getMargin (Sheet.BottomMargin));

    sheetNew.setMargin (Sheet.FooterMargin, sheetOld.getMargin (Sheet.FooterMargin));

    sheetNew.setMargin (Sheet.HeaderMargin, sheetOld.getMargin (Sheet.HeaderMargin));

    sheetNew.setMargin (Sheet.LeftMargin, sheetOld.getMargin (Sheet.LeftMargin));

    sheetNew.setMargin (Sheet.RightMargin, sheetOld.getMargin (Sheet.RightMargin));

    sheetNew.setMargin (Sheet.TopMargin, sheetOld.getMargin (Sheet.TopMargin));

    sheetNew.setPrintGridlines (sheetNew.isPrintGridlines ());

    sheetNew.setRightToLeft (sheetNew.isRightToLeft ());

    sheetNew.setRowSumsBelow (sheetNew.getRowSumsBelow ());

    sheetNew.setRowSumsRight (sheetNew.getRowSumsRight ());

    sheetNew.setVerticallyCenter (sheetOld.getVerticallyCenter ());

    HSSFRow rowNew;

    for (Row row : sheetOld) {

        rowNew = sheetNew.createRow (row.getRowNum ());

        if (rowNew != null) this.transform (workbookOld, workbookNew, (XSSFRow) row, rowNew);

    }

    for (int i = 0;

    i < this.lastColumn; i ++) {

        sheetNew.setColumnWidth (i, sheetOld.getColumnWidth (i));

        sheetNew.setColumnHidden (i, sheetOld.isColumnHidden (i));

    }

    for (int i = 0;

    i < sheetOld.getNumMergedRegions (); i ++) {

        CellRangeAddress merged = sheetOld.getMergedRegion (i);

        sheetNew.addMergedRegion (merged);

    }

}
