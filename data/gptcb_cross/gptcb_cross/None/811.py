def transform(workbookOld, workbookNew, rowOld, rowNew):
    cellNew=None
    rowNew.set_height(rowOld.get_height())
    for cell in rowOld:
       cellNew=rowNew.create_cell(cell.get_column_index(),cell.get_cell_type())
       if(cellNew != None):
           this.transform(workbookOld, workbookNew, cell, cellNew)
    this.lastColumn=max(this.lastColumn, rowOld.get_last_cell_num())