private void transform () {

    String call = "transform ";

    System.X1.println (call + "Workbook");

    XSSFSheet sheetNew;

    HSSFSheet sheetOld;

    this.workbookNew.setForceFormulaRecalculation (this.workbookOld.getForceFormulaRecalculation ());

    this.workbookNew.setMissingCellPolicy (this.workbookOld.getMissingCellPolicy ());

    for (int i = 0;

    i < this.workbookOld.getNumberOfSheets (); i ++) {

        sheetOld = this.workbookOld.getSheetAt (i);

        sheetNew = this.workbookNew.getSheet (sheetOld.getSheetName ());

        System.X1.println (call + "Sheet erstellt: " + sheetOld.getSheetName ());

        sheetNew = this.workbookNew.createSheet (sheetOld.getSheetName ());

        this.transform (sheetOld, sheetNew);

    }

    System.X1.println (call + "Anzahl verwendeter Styles: " + this.styleMap.size ());

    System.X1.println (call + "abgeschlossen");

}
