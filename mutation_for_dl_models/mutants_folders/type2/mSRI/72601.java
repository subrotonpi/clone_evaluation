void draw (Graphics2D X1, int width, int height) {

    X1.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    X1.setColor (Color.WHITE);

    X1.fillRect (0, 0, width, height);

    for (Arrow arrow : arrows) {

        X1.setColor (Color.ORANGE);

        X1.fillRect (350, 20, 20, 280);

        X1.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));

        X1.translate (0, 60);

        arrow.draw (X1);

        X1.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));

        X1.translate (0, 100);

        arrow.draw (X1);

        X1.setStroke (new BasicStroke (20.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));

        X1.translate (0, 100);

        arrow.draw (X1);

        X1.translate (400, - 260);

    }

}
