def transform(row_old, row_new):
    row_new.height = row_old.height
    if row_old.row_style is not None:
        hash_code = row_old.row_style.hash_code
        if not row_old.style_map.__contains__(hash_code):
            transform(hash_code, row_old.row_style, row_new.workbook.create_cell_style())
        row_new.row_style = row_old.style_map.get(hash_code)
    for cell in row_old:
        cell_new = row_new.create_cell(cell.column_index, cell.cell_type)
        if cell_new is not None:
            transform(cell, cell_new)
    last_column = max(last_column, row_old.last_cell_num)