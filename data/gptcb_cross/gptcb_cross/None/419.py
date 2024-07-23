def transform():
    call = "transform "
    print(call + "Workbook")
    sheet_new = None
    sheet_old = None
    self.workbook_new.setForceFormulaRecalculation(self.workbook_old.getForceFormulaRecalculation())
    self.workbook_new.setMissingCellPolicy(self.workbook_old.getMissingCellPolicy())
    for i in range(self.workbook_old.getNumberOfSheets()):
        sheet_old = self.workbook_old.getSheetAt(i)
        sheet_new = self.workbook_new.getSheet(sheet_old.getSheetName())
        print(call + "Sheet erstellt: " + sheet_old.getSheetName())
        sheet_new = self.workbook_new.createSheet(sheet_old.getSheetName())
        self.transform(sheet_old, sheet_new)
    print(call + "Anzahl verwendeter Styles: " + str(len(self.styleMap)))
    print(call + "abgeschlossen")