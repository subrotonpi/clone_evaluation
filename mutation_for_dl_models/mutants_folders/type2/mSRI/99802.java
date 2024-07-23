private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFSheet sheetOld, XSSFSheet X1) {

    System.out.println ("transform Sheet");

    X1.setDisplayFormulas (sheetOld.isDisplayFormulas ());

    X1.setDisplayGridlines (sheetOld.isDisplayGridlines ());

    X1.setDisplayGuts (sheetOld.getDisplayGuts ());

    X1.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());

    X1.setDisplayZeros (sheetOld.isDisplayZeros ());

    X1.setFitToPage (sheetOld.getFitToPage ());

    X1.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());

    X1.setMargin (Sheet.BottomMargin, sheetOld.getMargin (Sheet.BottomMargin));

    X1.setMargin (Sheet.FooterMargin, sheetOld.getMargin (Sheet.FooterMargin));

    X1.setMargin (Sheet.HeaderMargin, sheetOld.getMargin (Sheet.HeaderMargin));

    X1.setMargin (Sheet.LeftMargin, sheetOld.getMargin (Sheet.LeftMargin));

    X1.setMargin (Sheet.RightMargin, sheetOld.getMargin (Sheet.RightMargin));

    X1.setMargin (Sheet.TopMargin, sheetOld.getMargin (Sheet.TopMargin));

    X1.setPrintGridlines (X1.isPrintGridlines ());

    X1.setRowSumsBelow (X1.getRowSumsBelow ());

    X1.setRowSumsRight (X1.getRowSumsRight ());

    X1.setVerticallyCenter (sheetOld.getVerticallyCenter ());

    XSSFRow rowNew;

    for (Row row : sheetOld) {

        rowNew = X1.createRow (row.getRowNum ());

        if (rowNew != null) this.transform (workbookOld, workbookNew, (HSSFRow) row, rowNew);

    }

    for (int i = 0;

    i < this.lastColumn; i ++) {

        X1.setColumnWidth (i, sheetOld.getColumnWidth (i));

        X1.setColumnHidden (i, sheetOld.isColumnHidden (i));

    }

    for (int i = 0;

    i < sheetOld.getNumMergedRegions (); i ++) {

        CellRangeAddress merged = sheetOld.getMergedRegion (i);

        X1.addMergedRegion (merged);

    }

}
