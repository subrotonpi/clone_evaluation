def transform(workbookOld, workbookNew, cellOld, cellNew):
    cellNew.setCellComment(cellOld.getCellComment())
    cell_hash = cellOld.getCellStyle().__hash__()
    
    if not cell_style_map.__contains__(cell_hash):
        transform(workbookOld, workbookNew, cell_hash, cellOld.getCellStyle(), workbookNew.createCellStyle())

    cellNew.setCellStyle(cell_style_map.get(cell_hash))

    cell_type = cellOld.getCellType()
    if cell_type == cells.CELL_TYPE_BLANK:
        pass
    elif cell_type == cells.CELL_TYPE_BOOLEAN:
        cellNew.setCellValue(cellOld.getBooleanCellValue())
    elif cell_type == cells.CELL_TYPE_ERROR:
        cellNew.setCellValue(cellOld.getErrorCellValue())
    elif cell_type == cells.CELL_TYPE_FORMULA:
        cellNew.setCellValue(cellOld.getCellFormula())
    elif cell_type == cells.CELL_TYPE_NUMERIC:
        cellNew.setCellValue(cellOld.getNumericCellValue())
    elif cell_type == cells.CELL_TYPE_STRING:
        cellNew.setCellValue(cellOld.getStringCellValue())
    else:
        print("transform: Unbekannter Zellentyp "+ str(cellOld.getCellType()))