def transform(workbookOld, workbookNew, rowOld, rowNew):
    rowNew.height = rowOld.height
    for cell in rowOld:
        cellNew = rowNew.create_cell(cell.column_index, cell.cell_type)
        if cellNew is not None: 
            transform(workbookOld, workbookNew, cellOld, cellNew)
    lastColumn = max(lastColumn, rowOld.last_cell_num)