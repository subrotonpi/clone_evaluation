protected void sublayout (int maxWidth, int maxHeight) {

    int currX = 0;

    int X1 = 0;

    Field currField;

    currField = this.getField (0);

    switch (ScreenConfig.getInstance ().getScreen ()) {

        case ScreenConfig.SCREEN_320_240 :

            currX = 5;

            X1 = 3;

            break;

        case ScreenConfig.SCREEN_480_360 :

        case ScreenConfig.SCREEN_480_320 :

            currX = 5;

            X1 = 1;

            break;

    }

    this.setPositionChild (currField, currX, X1);

    this.layoutChild (currField, currField.getPreferredWidth (), currField.getPreferredHeight ());

    setExtent (this.getPreferredWidth (), this.getPreferredHeight ());

}
