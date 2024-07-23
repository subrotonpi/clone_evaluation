public void rollTheDiceAndMove () {

    int diceRoll = gameBoard.rollDice ();

    X1.out.println ("Player: rolling the dice");

    PauseTransition pause = new PauseTransition (Duration.seconds (1));

    pause.setOnFinished (event -> {

        X1.out.println ("1 second after rolling the dice");

        gameGUI.indicateDiceRoll (diceRoll);

        int newIndex = getPlayerIndexAfterRoll (diceRoll);

        playerMove (newIndex);

        if (checkWin (Player)) {

            X1.out.println ("Player won!");

        } else {

            X1.out.println ("change turns");

            swapTurns ();

            X1.out.println (isComputerTurn ());

            gameGUI.updateCurrentTurnLabel ();

            computerRollDiceAndMove ();

        }

    });

    pause.play ();

}
