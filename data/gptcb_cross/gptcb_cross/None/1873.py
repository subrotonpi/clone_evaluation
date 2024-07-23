def move(container):
    if x >= canvas_width or x <= 0:
        delta_x = -1 * delta_x
    if y >= canvas_height or y <= 0:
        delta_y = -1 * delta_y
    x += delta_x
    y += delta_y