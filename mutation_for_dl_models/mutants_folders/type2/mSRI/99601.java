private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFCell cellOld, HSSFCell cellNew) {

    cellNew.setCellComment (cellOld.getCellComment ());

    Integer X1 = cellOld.getCellStyle ().hashCode ();

    if (this.styleMap != null && ! this.styleMap.containsKey (X1)) {

        this.transform (workbookOld, workbookNew, X1, cellOld.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());

    }

    cellNew.setCellStyle (this.styleMap.get (X1));

    switch (cellOld.getCellType ()) {

        case Cell.CELL_TYPE_BLANK :

            break;

        case Cell.CELL_TYPE_BOOLEAN :

            cellNew.setCellValue (cellOld.getBooleanCellValue ());

            break;

        case Cell.CELL_TYPE_ERROR :

            cellNew.setCellValue (cellOld.getErrorCellValue ());

            break;

        case Cell.CELL_TYPE_FORMULA :

            cellNew.setCellValue (cellOld.getCellFormula ());

            break;

        case Cell.CELL_TYPE_NUMERIC :

            cellNew.setCellValue (cellOld.getNumericCellValue ());

            break;

        case Cell.CELL_TYPE_STRING :

            cellNew.setCellValue (cellOld.getStringCellValue ());

            break;

        default :

            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());

    }

}
