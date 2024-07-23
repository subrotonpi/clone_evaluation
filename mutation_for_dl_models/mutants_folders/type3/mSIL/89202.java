public void start (final Stage primaryStage) {

    final WebView webView = new WebView ();

    final ModalDialog dialog = createWebViewPreferenceDialog (primaryStage, webView,X1);

    webView.getEngine ().getLoadWorker ().stateProperty ().addListener (new ChangeListener < Worker.State > () {

        @Override

        public void changed (ObservableValue < ? extends Worker.State > observableValue, Worker.State state, Worker.State newState) {

            if (newState.equals (Worker.State.SUCCEEDED)) {

                dialog.show ();

                dialog.toFront ();

            }

        }}

    );

    webView.getEngine ().load ("http://docs.oracle.com/javafx/");

    primaryStage.setTitle ("Modal Confirm Example");

    primaryStage.setScene (new Scene (webView));

    primaryStage.show ();

}
