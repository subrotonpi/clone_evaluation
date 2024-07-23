public void rollTheDiceAndMove () {

    int diceRoll = gameBoard.rollDice ();

    ScheduledFuture < Void > scheduledFuture = Executors.newScheduledThreadPool (1).schedule (new Task < Void > () {

        @Override

        public Void call () {

            X1.indicateDiceRoll (diceRoll);

            int newIndex = getPlayerIndexAfterRoll (diceRoll);

            ScheduledFuture < Void > moveScheduledFuture = move (newIndex);

            if (moveScheduledFuture != null) {

                moveScheduledFuture.get ();

            }

            System.out.println ("change turns");

            swapTurns ();

            System.out.println (isComputerTurn ());

            X1.updateCurrentTurnLabel ();

            if (newIndex == GameBoard.WIN_POINT) {

                boolean restartGame = gameBoard.playAgainOrExit ();

                if (restartGame) {

                    Player winner = gameBoard.getCurrentPlayer ();

                    X1.updateScore (winner);

                    X1.playAgain ();

                } else {

                    System.exit (0);

                }

            }

            return null;

        }}

    , GameBoard.DICE_ROLL_DELAY, TimeUnit.SECONDS);

    scheduledFuture.get ();

}
