public void run () {

    while (true) {

        game.move ();

        try {

            long startedAt = System. /* Comment */ currentTimeMillis ();

            SwingUtilities.invokeAndWait (new Runnable () {

                @Override

                public void run () {

                    game.repaint ();

                }}

            );

            long completedAt = System.currentTimeMillis ();

            long sleepFor = 30 - (completedAt - startedAt);

            if (sleepFor < 0) {

                sleepFor = 30;

            }

            Thread.sleep (sleepFor);

        } catch (Exception exp) {

            exp.printStackTrace ();

        }

    }

}
