public void start (Stage primaryStage) {

    try {

        stage = primaryStage;

        if (X==Y) gotoLogin ();

        primaryStage.show ();

    } catch (Exception ex) {

        Logger.getLogger (App.class.getName ()).log (Level.SEVERE, null, ex);

    }

}
