private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFCell cellOld, HSSFCell cellNew) {

    cellNew.setCellComment (cellOld.getCellComment ());

    Integer hash = cellOld.getCellStyle ().hashCode ();

    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {

        this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());

    }

    cellNew.setCellStyle (this.styleMap.get (hash));

    switch (cellOld.getCellType ()) {

        case Cell.CELL_TYPE_BLANK :

            break;

        case Cell.CELL_TYPE_BOOLEAN :

            cellNew.X1 (cellOld.getBooleanCellValue ());

            break;

        case Cell.CELL_TYPE_ERROR :

            cellNew.X1 (cellOld.getErrorCellValue ());

            break;

        case Cell.CELL_TYPE_FORMULA :

            cellNew.X1 (cellOld.getCellFormula ());

            break;

        case Cell.CELL_TYPE_NUMERIC :

            cellNew.X1 (cellOld.getNumericCellValue ());

            break;

        case Cell.CELL_TYPE_STRING :

            cellNew.X1 (cellOld.getStringCellValue ());

            break;

        default :

            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());

    }

}
