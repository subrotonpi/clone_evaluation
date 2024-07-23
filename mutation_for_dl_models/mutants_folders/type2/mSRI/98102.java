private void transform () {

    String call = "transform ";

    System.out.println (call + "Workbook");

    XSSFSheet sheetNew;

    HSSFSheet sheetOld;

    this.workbookNew.setForceFormulaRecalculation (this.X1.getForceFormulaRecalculation ());

    this.workbookNew.setMissingCellPolicy (this.X1.getMissingCellPolicy ());

    for (int i = 0;

    i < this.X1.getNumberOfSheets (); i ++) {

        sheetOld = this.X1.getSheetAt (i);

        sheetNew = this.workbookNew.getSheet (sheetOld.getSheetName ());

        System.out.println (call + "Sheet erstellt: " + sheetOld.getSheetName ());

        sheetNew = this.workbookNew.createSheet (sheetOld.getSheetName ());

        this.transform (sheetOld, sheetNew);

    }

    System.out.println (call + "Anzahl verwendeter Styles: " + this.styleMap.size ());

    System.out.println (call + "abgeschlossen");

}
