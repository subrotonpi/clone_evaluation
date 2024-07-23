public void draw (Graphics2D g) {

    float X1 = 0.5f;

    float arrowLength = 80.0f;

    BasicStroke stroke = (BasicStroke) g.getStroke ();

    float endX = 350.0f;

    float veeX = endX - stroke.getLineWidth () * 0.5f / X1;

    Path2D.Float path = new Path2D.Float ();

    float waisting = 0.5f;

    float waistX = endX - arrowLength * 0.5f;

    float waistY = X1 * arrowLength * 0.5f * waisting;

    float arrowWidth = X1 * arrowLength;

    path.moveTo (veeX - arrowLength, - arrowWidth);

    path.quadTo (waistX, - waistY, endX, 0.0f);

    path.quadTo (waistX, waistY, veeX - arrowLength, arrowWidth);

    path.lineTo (veeX - arrowLength * 0.75f, 0.0f);

    path.lineTo (veeX - arrowLength, - arrowWidth);

    g.setColor (Color.BLUE);

    g.fill (path);

    g.setColor (Color.RED);

    g.draw (new Line2D.Float (50.0f, 0.0f, veeX - arrowLength * 0.5f, 0.0f));

}
