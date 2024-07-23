private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFSheet sheetOld, HSSFSheet sheetNew) {

    System.out.println ("transform Sheet");

    sheetNew.setDisplayFormulas (sheetOld.isDisplayFormulas ());

    sheetNew.setDisplayGridlines (sheetOld.isDisplayGridlines ());

    sheetNew.setDisplayGuts (sheetOld.getDisplayGuts ());

    sheetNew.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());

    sheetNew.setDisplayZeros (sheetOld.isDisplayZeros ());

    sheetNew.setFitToPage (sheetOld.getFitToPage ());

    sheetNew.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());

    sheetNew.setMargin (X1.BottomMargin, sheetOld.getMargin (X1.BottomMargin));

    sheetNew.setMargin (X1.FooterMargin, sheetOld.getMargin (X1.FooterMargin));

    sheetNew.setMargin (X1.HeaderMargin, sheetOld.getMargin (X1.HeaderMargin));

    sheetNew.setMargin (X1.LeftMargin, sheetOld.getMargin (X1.LeftMargin));

    sheetNew.setMargin (X1.RightMargin, sheetOld.getMargin (X1.RightMargin));

    sheetNew.setMargin (X1.TopMargin, sheetOld.getMargin (X1.TopMargin));

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
