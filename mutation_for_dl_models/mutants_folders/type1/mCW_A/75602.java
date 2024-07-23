public void start (Stage primaryStage) {

    final TextArea textArea = new TextArea ();

    textArea.setPrefSize (200, 40); 

    textArea.setWrapText (true);

    textHolder.textProperty ().bind (textArea.textProperty ());

    textHolder.layoutBoundsProperty ().addListener (new ChangeListener < Bounds > () {

        @Override

        public void changed (ObservableValue < ? extends Bounds > observable, Bounds oldValue, Bounds newValue) {

            if (oldHeight != newValue.getHeight ()) {

                System.out.println ("newValue = " + newValue.getHeight ());

                oldHeight = newValue.getHeight ();

                textArea.setPrefHeight (textHolder.getLayoutBounds ().getHeight () + 20);

            }

        }}

    );

    Group root = new Group (textArea);

    Scene scene = new Scene (root, 300, 250);

    primaryStage.setScene (scene);

    primaryStage.show ();

}
