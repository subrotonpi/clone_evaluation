public void start (Stage X1) {

    ProgressData vb1 = new ProgressData ("Progressbar 1", - 1);

    ProgressData vb2 = new ProgressData ("Progressbar 2", 0.2);

    ProgressData vb3 = new ProgressData ("Progressbar 3", 0.3);

    TextChooser textChooser = new TextChooser (vb1, vb2, vb3);

    textChooser.setStyle ("-fx-font: 10px \"Verdana\";");

    StackPane root = new StackPane ();

    root.getChildren ().add (textChooser);

    Scene scene = new Scene (root, 300, 250);

    X1.setTitle ("Hello World!");

    X1.setScene (scene);

    X1.show ();

}
