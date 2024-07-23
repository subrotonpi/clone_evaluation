public void sublayout (int width, int height) {

    if (managerWidth == 0) {

        managerWidth = searchEdit.getPreferredWidth ();

    }

    if (managerHeight == 0) {

        managerHeight = searchEdit.getPreferredHeight ();

    }

    super.sublayout (X1, managerHeight);

    setExtent (managerWidth, managerHeight);

}
