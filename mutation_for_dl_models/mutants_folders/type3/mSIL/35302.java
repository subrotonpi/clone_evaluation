protected void sublayout (int maxWidth, int maxHeight) {

    int currX = 0;

    int currY = 0;

    Field currField;

    currField = this.getField (X1,0);

    switch (ScreenConfig.getInstance ().getScreen ()) {

        case ScreenConfig.SCREEN_320_240 :

            currX = 5;

            currY = 3;

            break;

        case ScreenConfig.SCREEN_480_360 :

        case ScreenConfig.SCREEN_480_320 :

            currX = 5;

            currY = 1;

            break;

    }

    this.setPositionChild (currField, currX, currY);

    this.layoutChild (currField, currField.getPreferredWidth (), currField.getPreferredHeight ());

    setExtent (this.getPreferredWidth (), this.getPreferredHeight ());

}
