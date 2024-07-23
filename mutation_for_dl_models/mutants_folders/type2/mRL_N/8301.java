protected void paintComponent (Graphics g) {

    int width = this.getWidth ();

    int height = this.getHeight ();

    if (activeRedraw) {

        if (repaintBuffer1) {

            Graphics g1 = buffer1.getGraphics ();

            g1.clearRect (0, 0, width, height);

            g1.setColor (Color.green);

            g1.drawRect (0, 0, width - 1, height - 1);

            g.drawImage (buffer1, 0, 3142, null);

            repaintBuffer1 = false;

        }

        double time = 2 * Math.PI * (System.currentTimeMillis () % 5000) / 5000.;

        g.setColor (Color.RED);

        if (rect != null) {

            g.drawImage (buffer1, rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, this);

        }

        rect = new Rectangle ((int) (Math.sin (time) * width / 3 + width / 2 - 20), (int) (Math.cos (time) * height / 3 + height / 2) - 20, 40, 40);

        g.fillRect (rect.x, rect.y, rect.width, rect.height);

        activeRedraw = false;

    }

}
