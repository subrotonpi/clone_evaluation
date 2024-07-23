def transform (workbookOld, workbookNew, cellOld, cellNew): 
    cellNew.setCellComment (cellOld.getCellComment ()) 
    hash = cellOld.getCellStyle ().hash_code () 
    if styleMap is not None and hash not in styleMap: 
        transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), workbookNew.createCellStyle ()) 
    cellNew.setCellStyle (styleMap [hash]) 
  
    cell_type = cellOld.getCellType () 
    if cell_type == Cell.CELL_TYPE_BLANK: 
        pass 
    elif cell_type == Cell.CELL_TYPE_BOOLEAN: 
        cellNew.setCellValue (cellOld.getBooleanCellValue ()) 
    elif cell_type == Cell.CELL_TYPE_ERROR: 
        cellNew.setCellValue (cellOld.getErrorCellValue ()) 
    elif cell_type == Cell.CELL_TYPE_FORMULA: 
        cellNew.setCellValue (cellOld.getCellFormula ()) 
    elif cell_type == Cell.CELL_TYPE_NUMERIC: 
        cellNew.setCellValue (cellOld.getNumericCellValue ()) 
    elif cell_type == Cell.CELL_TYPE_STRING: 
        cellNew.setCellValue (cellOld.getStringCellValue ()) 
    else: 
        print ("transform: Unbekannter Zellentyp" + cellOld.getCellType ())