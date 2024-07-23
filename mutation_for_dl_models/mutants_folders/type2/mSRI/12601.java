public void start (Stage X1) {

    try {

        stage = X1;

        gotoLogin ();

        X1.show ();

    } catch (Exception ex) {

        Logger.getLogger (App.class.getName ()).log (Level.SEVERE, null, ex);

    }

}
