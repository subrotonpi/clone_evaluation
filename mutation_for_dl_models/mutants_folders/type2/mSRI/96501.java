private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFSheet X1, HSSFSheet sheetNew) {

    System.out.println ("transform Sheet");

    sheetNew.setDisplayFormulas (X1.isDisplayFormulas ());

    sheetNew.setDisplayGridlines (X1.isDisplayGridlines ());

    sheetNew.setDisplayGuts (X1.getDisplayGuts ());

    sheetNew.setDisplayRowColHeadings (X1.isDisplayRowColHeadings ());

    sheetNew.setDisplayZeros (X1.isDisplayZeros ());

    sheetNew.setFitToPage (X1.getFitToPage ());

    sheetNew.setHorizontallyCenter (X1.getHorizontallyCenter ());

    sheetNew.setMargin (Sheet.BottomMargin, X1.getMargin (Sheet.BottomMargin));

    sheetNew.setMargin (Sheet.FooterMargin, X1.getMargin (Sheet.FooterMargin));

    sheetNew.setMargin (Sheet.HeaderMargin, X1.getMargin (Sheet.HeaderMargin));

    sheetNew.setMargin (Sheet.LeftMargin, X1.getMargin (Sheet.LeftMargin));

    sheetNew.setMargin (Sheet.RightMargin, X1.getMargin (Sheet.RightMargin));

    sheetNew.setMargin (Sheet.TopMargin, X1.getMargin (Sheet.TopMargin));

    sheetNew.setPrintGridlines (sheetNew.isPrintGridlines ());

    sheetNew.setRightToLeft (sheetNew.isRightToLeft ());

    sheetNew.setRowSumsBelow (sheetNew.getRowSumsBelow ());

    sheetNew.setRowSumsRight (sheetNew.getRowSumsRight ());

    sheetNew.setVerticallyCenter (X1.getVerticallyCenter ());

    HSSFRow rowNew;

    for (Row row : X1) {

        rowNew = sheetNew.createRow (row.getRowNum ());

        if (rowNew != null) this.transform (workbookOld, workbookNew, (XSSFRow) row, rowNew);

    }

    for (int i = 0;

    i < this.lastColumn; i ++) {

        sheetNew.setColumnWidth (i, X1.getColumnWidth (i));

        sheetNew.setColumnHidden (i, X1.isColumnHidden (i));

    }

    for (int i = 0;

    i < X1.getNumMergedRegions (); i ++) {

        CellRangeAddress merged = X1.getMergedRegion (i);

        sheetNew.addMergedRegion (merged);

    }

}
