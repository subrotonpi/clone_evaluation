public void start () {

    try {

        stage = primaryStage;

        gotoLogin ();

        primaryStage.show ();

    } catch (Exception ex) {

        Logger.getLogger (App.class.getName ()).log (Level.SEVERE, null, ex);

    }

}
