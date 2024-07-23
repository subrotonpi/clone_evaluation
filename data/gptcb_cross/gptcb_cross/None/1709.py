def transform(hash, styleOld, styleNew):
    styleNew.alignment = styleOld.alignment
    styleNew.border_bottom = styleOld.border_bottom
    styleNew.border_left = styleOld.border_left
    styleNew.border_right = styleOld.border_right
    styleNew.border_top = styleOld.border_top
    styleNew.data_format = transform(styleOld.data_format)
    styleNew.fill_background_color = styleOld.fill_background_color
    styleNew.fill_foreground_color = styleOld.fill_foreground_color
    styleNew.fill_pattern = styleOld.fill_pattern
    styleNew.font = transform(styleOld.font)
    styleNew.hidden = styleOld.hidden
    styleNew.indention = styleOld.indention
    styleNew.locked = styleOld.locked
    styleNew.vertical_alignment = styleOld.vertical_alignment
    styleNew.wrap_text = styleOld.wrap_text
    styleMap[hash] = styleNew