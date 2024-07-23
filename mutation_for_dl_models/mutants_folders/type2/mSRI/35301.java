public void sublayout (int width, int height) {

    if (X1 == 0) {

        X1 = searchEdit.getPreferredWidth ();

    }

    if (managerHeight == 0) {

        managerHeight = searchEdit.getPreferredHeight ();

    }

    super.sublayout (X1, managerHeight);

    setExtent (X1, managerHeight);

}
