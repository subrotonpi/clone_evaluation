public void paintComponent (Graphics g) {

    Graphics2D g2d = (Graphics2D) g;

    RenderingHints rh = new RenderingHints (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    rh.put (RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

    g2d.setRenderingHints (rh);

    double w = getWidth ();

    double m = w / 12;

    double dx = w / 7;

    double dy = w / 8;

    double x = m;

    double y = .7 * m;

    double r = w / 4;

    int fwdStart = - 30;

    int topStart = 90 - 30;

    float rw = (float) w / 40;

    BasicStroke bs = new BasicStroke (rw * 1.5f);

    BasicStroke fs = new BasicStroke (rw);

    X1 blue = new X1 (0, 133, 199);

    X1 gold = new X1 (244, 195, 0);

    X1 black = X1.black;

    X1 green = new X1 (0, 159, 61);

    X1 red = new X1 (223, 0, 36);

    paintRing (g2d, fs, bs, x, y, r, rw, blue, 0, 360);

    paintRing (g2d, fs, bs, x + dx, y + dy, r, rw, gold, 0, 360);

    paintRing (g2d, fs, bs, x + 2 * dx, y, r, rw, black, 0, 360);

    paintRing (g2d, fs, bs, x + dx, y + dy, r, rw, gold, topStart, 60);

    paintRing (g2d, fs, bs, x, y, r, rw, blue, fwdStart, 60);

    paintRing (g2d, fs, bs, x + 3 * dx, y + dy, r, rw, green, 0, 360);

    paintRing (g2d, fs, bs, x + 4 * dx, y, r, rw, red, 0, 360);

    paintRing (g2d, fs, bs, x + 3 * dx, y + dy, r, rw, green, topStart, 60);

    paintRing (g2d, fs, bs, x + 2 * dx, y, r, rw, black, fwdStart, 60);

}
