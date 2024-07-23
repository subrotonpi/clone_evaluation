def transform (workbookOld, workbookNew, cellOld, cellNew): 
    cellNew.setCellComment (cellOld.getCellComment ())
    hash = cellOld.getCellStyle ().hashCode ()
    if styleMap != None and hash not in styleMap: 
        transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), workbookNew.createCellStyle ())
    cellNew.setCellStyle (styleMap [hash])
    if cellOld.getCellType () == Cell.CELL_TYPE_BLANK: 
        pass
    elif cellOld.getCellType () == Cell.CELL_TYPE_BOOLEAN: 
        cellNew.setCellValue (cellOld.getBooleanCellValue ())
    elif cellOld.getCellType () == Cell.CELL_TYPE_ERROR: 
        cellNew.setCellValue (cellOld.getErrorCellValue ())
    elif cellOld.getCellType () == Cell.CELL_TYPE_FORMULA: 
        cellNew.setCellValue (cellOld.getCellFormula ())
    elif cellOld.getCellType () == Cell.CELL_TYPE_NUMERIC: 
        cellNew.setCellValue (cellOld.getNumericCellValue ())
    elif cellOld.getCellType () == Cell.CELL_TYPE_STRING: 
        cellNew.setCellValue (cellOld.getStringCellValue ())
    else: 
        print("transform: Unbekannter Zellentyp " + cellOld.getCellType ())