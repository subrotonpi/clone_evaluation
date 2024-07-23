public void rollTheDiceAndMove () {

    int diceRoll = gameBoard.rollDice ();

    ScheduledFuture < Void > scheduledFuture = Executors.newScheduledThreadPool (1).schedule (new Task < Void > () {

        @Override

        public Void call () {

            gameGUI.indicateDiceRoll (diceRoll);

            int newIndex = getPlayerIndexAfterRoll (diceRoll);

            ScheduledFuture < Void > moveScheduledFuture = move (newIndex);

            if (moveScheduledFuture != null) {

                moveScheduledFuture.get ();

            }

            System.out.println ("change turns");

            swapTurns ();

            System.out.println (isComputerTurn ());

            gameGUI.updateCurrentTurnLabel ();

            if (newIndex == GameBoard.WIN_POINT) {

                boolean restartGame = gameBoard.playAgainOrExit ();

                if (restartGame) {

                    Player winner = gameBoard.getCurrentPlayer ();

                    gameGUI.updateScore (winner);

                    gameGUI.playAgain ();

                } else {

                    System.exit (0);

                }

            }

            return null;

        }}

    , GameBoard.DICE_ROLL_DELAY, TimeUnit.SECONDS);

    scheduledFuture.get ();

}