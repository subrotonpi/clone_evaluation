def draw (g): 
    arrowRatio = 0.5 
    arrowLength = 80.0 
    stroke = g.get_stroke () 
    endX = 350.0 
    veeX = endX - stroke.get_line_width () * 0.5 / arrowRatio 
    path = [] 
    waisting = 0.5 
    waistX = endX - arrowLength * 0.5 
    waistY = arrowRatio * arrowLength * 0.5 * waisting 
    arrowWidth = arrowRatio * arrowLength 

    path.append((veeX - arrowLength, -arrowWidth)) 
    path.append((waistX, -waistY)) 
    path.append((endX, 0.0)) 
    path.append((waistX, waistY)) 
    path.append((veeX - arrowLength, arrowWidth)) 
    path.append((veeX - arrowLength * 0.75, 0.0)) 

    g.set_color(Color.BLUE) 
    g.fill(path) 
    g.set_color(Color.RED) 
    g.draw(new Line2D.Float((50.0, 0.0, veeX - arrowLength * 0.5, 0.0)))