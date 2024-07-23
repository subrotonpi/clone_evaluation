public void run () {

    final CardLayout cards = new CardLayout ();

    final JPanel gui = new JPanel (cards);

    gui.setBorder (new EmptyBorder (100, 300, 100, 300));

    gui.setBackground (Color.WHITE);

    gui.add (new JLabel (icon1), "label " + 1);

    gui.add (new JLabel (icon2), "label " + 2);

    gui.add (new JLabel (icon3), "label " + 3);

    gui.add (new JLabel (icon4), "label " + 4);

    gui.add (new JLabel (icon3), "label " + 5);

    gui.add (new JLabel (icon2), "label " + 6);

    ActionListener animate = new ActionListener () {

        long lastTime = - 1;

        int frameCount = 0;

        String timeString;

        DecimalFormat format = new DecimalFormat ("0.00");

        @Override

        public void actionPerformed (ActionEvent e) {

            long time = System.nanoTime ();

            if (lastTime < 0) {

                lastTime = time;

                timeString = "00.00";

            } else if (time - lastTime > 1000) {

                long duration = time - lastTime;

                double fps = 1000000000d * (double) frameCount / (double) duration;

                timeString = format.format (fps);

                frameCount = 0;

                lastTime = time;

                System.out.println (timeString);

       /* Comment */       }

            frameCount ++;

            cards.next (gui);

        }}

    ;

    Timer timer = new Timer (5, animate);

    timer.start ();

    JOptionPane.showMessageDialog (null, gui);

    timer.stop ();

}
