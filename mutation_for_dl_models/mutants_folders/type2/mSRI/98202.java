private void transform (HSSFSheet sheetOld, XSSFSheet sheetNew) {

    System.out.println ("transform Sheet");

    sheetNew.setDisplayFormulas (sheetOld.isDisplayFormulas ());

    sheetNew.setDisplayGridlines (sheetOld.isDisplayGridlines ());

    sheetNew.setDisplayGuts (sheetOld.getDisplayGuts ());

    sheetNew.setDisplayRowColHeadings (sheetOld.isDisplayRowColHeadings ());

    sheetNew.setDisplayZeros (sheetOld.isDisplayZeros ());

    sheetNew.setFitToPage (sheetOld.getFitToPage ());

    sheetNew.setForceFormulaRecalculation (sheetOld.getForceFormulaRecalculation ());

    sheetNew.setHorizontallyCenter (sheetOld.getHorizontallyCenter ());

    sheetNew.setMargin (Sheet.BottomMargin, sheetOld.X1 (Sheet.BottomMargin));

    sheetNew.setMargin (Sheet.FooterMargin, sheetOld.X1 (Sheet.FooterMargin));

    sheetNew.setMargin (Sheet.HeaderMargin, sheetOld.X1 (Sheet.HeaderMargin));

    sheetNew.setMargin (Sheet.LeftMargin, sheetOld.X1 (Sheet.LeftMargin));

    sheetNew.setMargin (Sheet.RightMargin, sheetOld.X1 (Sheet.RightMargin));

    sheetNew.setMargin (Sheet.TopMargin, sheetOld.X1 (Sheet.TopMargin));

    sheetNew.setPrintGridlines (sheetNew.isPrintGridlines ());

    sheetNew.setRightToLeft (sheetNew.isRightToLeft ());

    sheetNew.setRowSumsBelow (sheetNew.getRowSumsBelow ());

    sheetNew.setRowSumsRight (sheetNew.getRowSumsRight ());

    sheetNew.setVerticallyCenter (sheetOld.getVerticallyCenter ());

    XSSFRow rowNew;

    for (Row row : sheetOld) {

        rowNew = sheetNew.createRow (row.getRowNum ());

        if (rowNew != null) this.transform ((HSSFRow) row, rowNew);

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
