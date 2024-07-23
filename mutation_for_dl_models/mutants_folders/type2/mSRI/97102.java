private void transform (HSSFCell cellOld, XSSFCell X1) {

    X1.setCellComment (cellOld.getCellComment ());

    Integer hash = cellOld.getCellStyle ().hashCode ();

    if (! this.styleMap.containsKey (hash)) {

        this.transform (hash, cellOld.getCellStyle (), this.workbookNew.createCellStyle ());

    }

    X1.setCellStyle (this.styleMap.get (hash));

    switch (cellOld.getCellType ()) {

        case Cell.CELL_TYPE_BLANK :

            break;

        case Cell.CELL_TYPE_BOOLEAN :

            X1.setCellValue (cellOld.getBooleanCellValue ());

            break;

        case Cell.CELL_TYPE_ERROR :

            X1.setCellValue (cellOld.getErrorCellValue ());

            break;

        case Cell.CELL_TYPE_FORMULA :

            X1.setCellValue (cellOld.getCellFormula ());

            break;

        case Cell.CELL_TYPE_NUMERIC :

            X1.setCellValue (cellOld.getNumericCellValue ());

            break;

        case Cell.CELL_TYPE_STRING :

            X1.setCellValue (cellOld.getStringCellValue ());

            break;

        default :

            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());

    }

}
