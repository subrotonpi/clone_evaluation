def transform(): 
    call = "transform "
    print (call + "Workbook")
    workbookNew = ""
    workbookOld = ""
    workbookNew.setForceFormulaRecalculation (workbookOld.getForceFormulaRecalculation ())
    workbookNew.setMissingCellPolicy (workbookOld.getMissingCellPolicy ())
    for i in range (workbookOld.getNumberOfSheets ()):
        sheetOld = workbookOld.getSheetAt (i)
        sheetNew = workbookNew.getSheet (sheetOld.getSheetName ())
        print (call + "Sheet erstellt: " + sheetOld.getSheetName ())
        sheetNew = workbookNew.createSheet (sheetOld.getSheetName ())
        transform (sheetOld, sheetNew)
    print (call + "Anzahl verwendeter Styles: " + len(styleMap))
    print (call + "abgeschlossen")