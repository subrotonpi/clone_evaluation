def draw(g):
    arrow_ratio = 0.5
    arrow_length = 80.0
    stroke = g.get_stroke()
    end_x = 350.0
    vee_x = 0
    if stroke.get_line_join() == 'BasicStroke.JOIN_BEVEL':
        vee_x = end_x - stroke.get_line_width() * 0.25
    elif stroke.get_line_join() == 'BasicStroke.JOIN_MITER':
        vee_x = end_x - stroke.get_line_width() * 0.5 / arrow_ratio
    elif stroke.get_line_join() == 'BasicStroke.JOIN_ROUND':
        vee_x = end_x - stroke.get_line_width() * 0.5
   
    path = g.Path2D()
    path.move_to(vee_x - arrow_length, -arrow_ratio * arrow_length)
    path.line_to(vee_x, 0.0)
    path.line_to(vee_x - arrow_length, arrow_ratio * arrow_length)
    g.set_color('blue')
    g.draw(path)
    g.set_color('yellow')
    g.draw(g.Line2D(50.0, 0.0, vee_x, 0.0))
    g.set_color('red')
    g.draw(g.Line2D(50.0, 0.0, vee_x - stroke.get_line_width() * 0.25, 0.0))