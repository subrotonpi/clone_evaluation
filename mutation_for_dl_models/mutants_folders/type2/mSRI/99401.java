private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFCell X1, HSSFCell cellNew) {

    cellNew.setCellComment (X1.getCellComment ());

    Integer hash = X1.getCellStyle ().hashCode ();

    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {

        this.transform (workbookOld, workbookNew, hash, X1.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());

    }

    cellNew.setCellStyle (this.styleMap.get (hash));

    switch (X1.getCellType ()) {

        case Cell.CELL_TYPE_BLANK :

            break;

        case Cell.CELL_TYPE_BOOLEAN :

            cellNew.setCellValue (X1.getBooleanCellValue ());

            break;

        case Cell.CELL_TYPE_ERROR :

            cellNew.setCellValue (X1.getErrorCellValue ());

            break;

        case Cell.CELL_TYPE_FORMULA :

            cellNew.setCellValue (X1.getCellFormula ());

            break;

        case Cell.CELL_TYPE_NUMERIC :

            cellNew.setCellValue (X1.getNumericCellValue ());

            break;

        case Cell.CELL_TYPE_STRING :

            cellNew.setCellValue (X1.getStringCellValue ());

            break;

        default :

            System.out.println ("transform: Unbekannter Zellentyp " + X1.getCellType ());

    }

}
