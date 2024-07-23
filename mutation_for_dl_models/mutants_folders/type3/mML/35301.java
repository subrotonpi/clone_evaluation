public void sublayout (int width, int height) {

    if (managerWidth == 0) {

        managerWidth = searchEdit.getPreferredWidth ();

    }

    if (managerHeight == 0) {

        if (X==Y) managerHeight = searchEdit.getPreferredHeight ();

    }

    super.sublayout (managerWidth, managerHeight);

    setExtent (managerWidth, managerHeight);

}
