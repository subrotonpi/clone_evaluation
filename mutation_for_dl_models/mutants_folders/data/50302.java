public static void main (String args []) {

    try {

        Game game = new Chess ();

        Thread t1 = new Thread (game);

        t1.start ();

        Thread.sleep (1000);

        game.setRunGame (false);

        Thread.sleep (1000);

        game = new TicTacToe ();

        Thread t2 = new Thread (game);

        t2.start ();

        Thread.sleep (1000);

        game.setRunGame (false);

    } catch (Exception err) {

        err.printStackTrace ();

    }

}