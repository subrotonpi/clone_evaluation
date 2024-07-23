def transform(cellOld, cellNew):
    cellNew.set_cell_comment(cellOld.get_cell_comment())
    hash = cellOld.get_cell_style().hashCode()
    if hash not in this.styleMap:
        this.transform(hash, cellOld.get_cell_style(), this.worksbookNew.create_cell_style())
    cellNew.set_cell_style(this.styleMap[hash])
    
    if cellOld.cell_type == Cell.CELL_TYPE_BLANK:
        pass
    elif cellOld.cell_type == Cell.CELL_TYPE_BOOLEAN:
        cellNew.set_cell_value(cellOld.get_boolean_cell_value())
    elif cellOld.cell_type == Cell.CELL_TYPE_ERROR:
        cellNew.set_cell_value(cellOld.get_error_cell_value())
    elif cellOld.cell_type == Cell.CELL_TYPE_FORMULA:
        cellNew.set_cell_value(cellOld.get_cell_formula())
    elif cellOld.cell_type == Cell.CELL_TYPE_NUMERIC:
        cellNew.set_cell_value(cellOld.get_numeric_cell_value())
    elif cellOld.cell_type == Cell.CELL_TYPE_STRING:
        cellNew.set_cell_value(cellOld.get_string_cell_value())
    else:
        print("transform: Unknown cell type " + cellOld.cell_type)