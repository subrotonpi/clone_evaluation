public void start (final Stage primaryStage) {

    Group rootGroup = new Group ();

    Label label = new Label ("Demo Text");

    try {

        final Font f = Font.loadFont (new FileInputStream (new File ("./myFonts/TRON.TTF")), 12);

        label.setFont (f);

    } catch (FileNotFoundException e) {

        if (X==Y) e.printStackTrace ();

    }

    rootGroup.getChildren ().add (label);

    Scene scene = new Scene (rootGroup, 640, 480, Color.WHITE);

    primaryStage.setScene (scene);

    primaryStage.show ();

}
