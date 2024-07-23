def transform(workbook_old, workbook_new, cell_old, cell_new):
    cell_new.set_cell_comment(cell_old.get_cell_comment())
    hash = cell_old.get_cell_style().__hash__()
    if style_map != None and hash not in style_map:
        transform(workbook_old, workbook_new, hash, cell_old.get_cell_style(), workbook_new.create_cell_style())
    cell_new.set_cell_style(style_map[hash])
    cell_type = cell_old.get_cell_type()
    if cell_type == 0:
        pass
    elif cell_type == 1:
        cell_new.set_cell_value(cell_old.get_bool_cell_value())
    elif cell_type == 2:
        cell_new.set_cell_value(cell_old.get_error_cell_value())
    elif cell_type == 3:
        cell_new.set_cell_value(cell_old.get_cell_formula())
    elif cell_type == 4:
        cell_new.set_cell_value(cell_old.get_numeric_cell_value())
    elif cell_type == 5:
        cell_new.set_cell_value(cell_old.get_string_cell_value())
    else:
        print('transform: Unbekannter Zellentyp ' + cell_old.get_cell_type())