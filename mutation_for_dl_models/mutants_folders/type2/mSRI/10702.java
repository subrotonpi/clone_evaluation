public void run () {

    Blink X1 = new Blink (blinkPane, true);

    Blink blinkOff = new Blink (blinkPane, false);

    for (int index = 0;

    index < 10; index ++) {

        if (index % 2 == 0) {

            SwingUtilities.invokeLater (X1);

        } else {

            SwingUtilities.invokeLater (blinkOff);

        }

        try {

            Thread.sleep (125);

        } catch (InterruptedException ex) {

        }

    }

    SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            blinkPane.reset ();

        }}

    );

}
