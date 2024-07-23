def transform(hash_in, style_old, style_new):
    style_new.alignment = style_old.alignment
    style_new.border_bottom = style_old.border_bottom
    style_new.border_left = style_old.border_left
    style_new.border_right = style_old.border_right
    style_new.border_top = style_old.border_top
    style_new.data_format = transform(style_old.data_format)
    style_new.fill_background_color = style_old.fill_background_color
    style_new.fill_foreground_color = style_old.fill_foreground_color
    style_new.fill_pattern = style_old.fill_pattern
    style_new.font = transform(style_old.font)
    style_new.hidden = style_old.hidden
    style_new.indention = style_old.indention
    style_new.locked = style_old.locked
    style_new.vertical_alignment = style_old.vertical_alignment
    style_new.wrap_text = style_old.wrap_text
    style_map[hash_in] = style_new