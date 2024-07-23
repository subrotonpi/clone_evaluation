private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFCell cellOld, XSSFCell cellNew) {

    cellNew.setCellComment (cellOld.getCellComment ());

    Integer hash = cellOld.getCellStyle ().hashCode ();

    if (X1.styleMap != null && ! X1.styleMap.containsKey (hash)) {

        X1.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (XSSFCellStyle) workbookNew.createCellStyle ());

    }

    cellNew.setCellStyle (X1.styleMap.get (hash));

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
