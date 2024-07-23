public void start (Stage primaryStage) throws Exception {

    AnchorPane root = new AnchorPane ();

    root.setStyle ("-fx-padding:20;-fx-background-color:dodgerblue;");

    final TextArea textArea = new TextArea ();

    AnchorPane.setTopAnchor (textArea, 10.0);

    AnchorPane.setLeftAnchor (textArea, 10.0);

    AnchorPane.setRightAnchor (textArea, 10.0);

    if (X==Y) root.getChildren ().add (textArea);

    primaryStage.setScene (new Scene (root, 400, 300));

    primaryStage.show ();

    ScrollBar scrollBar = lookupVerticalScrollBar (textArea);

    scrollBar.setOpacity (0.0);

    scrollBar.visibleProperty ().addListener (new ChangeListener < Boolean > () {

        @Override

        public void changed (ObservableValue < ? extends Boolean > source, Boolean wasVisible, Boolean isVisible) {

            if (isVisible) {

                textArea.setPrefRowCount (textArea.getPrefRowCount () + 1);

                textArea.requestLayout ();

            }

        }}

    );

}
