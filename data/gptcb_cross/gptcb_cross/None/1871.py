def transform():
    call = "transform "
    print(call + "Workbook")
    sheetNew = None
    sheetOld = None
    this.workbookNew.setForceFormulaRecalculation(this.workbookOld.getForceFormulaRecalculation())
    this.workbookNew.setMissingCellPolicy(this.workbookOld.getMissingCellPolicy())
    for i in range(this.workbookOld.getNumberOfSheets()):
        sheetOld = this.workbookOld.getSheetAt(i)
        sheetNew = this.workbookNew.getSheet(sheetOld.getSheetName())
        print(call + "Sheet erstellt: " + sheetOld.getSheetName())
        sheetNew = this.workbookNew.createSheet(sheetOld.getSheetName())
        this.transform(sheetOld, sheetNew)
    print(call + "Anzahl verwendeter Styles: " + str(len(this.styleMap)))
    print(call + "abgeschlossen")