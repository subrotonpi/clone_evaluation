def transform(workbookOld, workbookNew, hash, styleOld, styleNew):
	styleNew.alignment = styleOld.alignment
	styleNew.borderBottom = styleOld.borderBottom
	styleNew.borderLeft = styleOld.borderLeft
	styleNew.borderRight = styleOld.borderRight 
	styleNew.borderTop = styleOld.borderTop
	styleNew.dataFormat = transform(workbookOld, workbookNew, styleOld.dataFormat)
	styleNew.fillBackgroundColor = styleOld.fillBackgroundColor
	styleNew.fillForegroundColor = styleOld.fillForegroundColor
	styleNew.fillPattern = styleOld.fillPattern
	styleNew.font = transform(workbookNew, styleOld.font)
	styleNew.hidden = styleOld.hidden
	styleNew.indention = styleOld.indention
	styleNew.locked = styleOld.locked
	styleNew.verticalAlignment = styleOld.verticalAlignment
	styleNew.wrapText = styleOld.wrapText
	styleMap[hash] = styleNew