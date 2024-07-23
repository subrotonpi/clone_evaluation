private void transform () {

    String call = "transform ";

    System.out.println (call + "Workbook");

    XSSFSheet sheetNew;

    HSSFSheet sheetOld;

    X1.workbookNew.setForceFormulaRecalculation (X1.workbookOld.getForceFormulaRecalculation ());

    X1.workbookNew.setMissingCellPolicy (X1.workbookOld.getMissingCellPolicy ());

    for (int i = 0;

    i < X1.workbookOld.getNumberOfSheets (); i ++) {

        sheetOld = X1.workbookOld.getSheetAt (i);

        sheetNew = X1.workbookNew.getSheet (sheetOld.getSheetName ());

        System.out.println (call + "Sheet erstellt: " + sheetOld.getSheetName ());

        sheetNew = X1.workbookNew.createSheet (sheetOld.getSheetName ());

        X1.transform (sheetOld, sheetNew);

    }

    System.out.println (call + "Anzahl verwendeter Styles: " + X1.styleMap.size ());

    System.out.println (call + "abgeschlossen");

}
