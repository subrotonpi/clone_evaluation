public void run () {

    while (true) {

        game.move ();

        try {

            long startedAt = System.currentTimeMillis ();

            SwingUtilities.invokeAndWait (new Runnable () {

                @Override

                public void run () {

                    game.repaint ();

                }}

            );

            long completedAt = System.currentTimeMillis ();

            long X1 = 30 - (completedAt - startedAt);

            if (X1 < 0) {

                X1 = 30;

            }

            Thread.sleep (X1);

        } catch (Exception exp) {

            exp.printStackTrace ();

        }

    }

}
