def transform(cell_old, cell_new):
    cell_new.set_cell_comment(cell_old.get_cell_comment())
    hash_val = cell_old.get_cell_style().hash_code()
    if hash_val not in style_map:
        transform(hash_val, cell_old.get_cell_style(), workbook_new.create_cell_style())
    cell_new.set_cell_style(style_map[hash_val])
    if cell_old.get_cell_type(==Cell.CELL_TYPE_BLANK):
        pass
    elif cell_old.get_cell_type(==Cell.CELL_TYPE_BOOLEAN):
        cell_new.set_cell_value(cell_old.get_boolean_cell_value())
    elif cell_old.get_cell_type(==Cell.CELL_TYPE_ERROR):
        cell_new.set_cell_value(cell_old.get_error_cell_value())
    elif cell_old.get_cell_type(==Cell.CELL_TYPE_FORMULA): 
        cell_new.set_cell_value(cell_old.get_cell_formula())
    elif cell_old.get_cell_type(==Cell.CELL_TYPE_NUMERIC): 
        cell_new.set_cell_value(cell_old.get_numeric_cell_value())
    elif cell_old.get_cell_type(==Cell.CELL_TYPE_STRING):
        cell_new.set_cell_value(cell_old.get_string_cell_value())
    else:
        print("transform: Unknown cell type " + cell_old.get_cell_type())