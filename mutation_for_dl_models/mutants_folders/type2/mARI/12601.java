public void start (X1 primaryStage) {

    try {

        stage = primaryStage;

        gotoLogin ();

        primaryStage.show ();

    } catch (Exception ex) {

        Logger.getLogger (App.class.getName ()).log (Level.SEVERE, null, ex);

    }

}
