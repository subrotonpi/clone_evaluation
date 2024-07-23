void draw (Graphics2D g, int width, int height) {

    g.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    g.setColor (Color.WHITE);

    g.fillRect (0, 0, width, height);

    for (Arrow arrow : arrows) {

        g.setColor (Color.ORANGE);

        g.fillRect (350, 20, 20, 280);

        g.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));

        g.translate (0, 60);

        arrow.draw (g);

        g.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));

        g.translate (0, 100);

        arrow.draw (g);

        g.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));

        g.translate (0, 100);

        arrow.draw (g);

        g.translate (400, - 260);

    }

}