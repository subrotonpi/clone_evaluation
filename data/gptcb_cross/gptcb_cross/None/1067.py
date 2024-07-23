def transform (rowOld, rowNew): 
    rowNew.set_height (rowOld.get_height ())
    if rowOld.get_row_style () != None: 
        hash = rowOld.get_row_style ().hash_code () 
        if not style_map.contains_key (hash):
            transform (hash, rowOld.get_row_style (), workbookNew.create_cell_style ())
        rowNew.set_row_style (style_map.get (hash))
    for cell in rowOld: 
        cellNew = rowNew.create_cell (cell.get_column_index (), cell.get_cell_type ())
        if cellNew != None:
            transform (cell, cellNew)
    last_column = max (last_column, rowOld.get_last_cell_num ())