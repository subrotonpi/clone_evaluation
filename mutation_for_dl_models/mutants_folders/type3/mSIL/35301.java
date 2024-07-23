public void sublayout (X1,int width, int height) {

    if (managerWidth == 0) {

        managerWidth = searchEdit.getPreferredWidth ();

    }

    if (managerHeight == 0) {

        managerHeight = searchEdit.getPreferredHeight ();

    }

    super.sublayout (managerWidth, managerHeight);

    setExtent (managerWidth, managerHeight);

}
