def draw(g):
    arrow_ratio = 0.5
    arrow_length = 80.0
    stroke = g.getStroke()
    end_x = 350.0
    vee_x = end_x - (stroke.getLineWidth() * 0.5 / arrow_ratio)
    path = Path2D.Float()
    waisting = 0.5
    waist_x = end_x - (arrow_length / 2)
    waist_y = (arrow_ratio * arrow_length) * (waisting / 2)
    arrow_width = (arrow_ratio * arrow_length)
    path.moveTo(vee_x - arrow_length, -arrow_width)
    path.quadTo(waist_x , -waist_y, end_x, 0.0)
    path.quadTo(waist_x, waist_y, vee_x - arrow_length, arrow_width)
    path.lineTo(vee_x - (arrow_length * 0.75), 0.0)
    path.lineTo(vee_x - arrow_length, -arrow_width)
    g.setColor(Color.BLUE)
    g.fill(path)
    g.setColor(Color.RED)
    g.draw(Line2D.Float(50.0, 0.0, (vee_x - (arrow_length * 0.5)), 0.0))