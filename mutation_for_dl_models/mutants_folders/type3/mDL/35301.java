public void sublayout (int width, int height) {

    if (managerWidth == 0) {

        managerWidth = searchEdit.getPreferredWidth ();

    }

    if (managerHeight == 0) {


    }

    super.sublayout (managerWidth, managerHeight);

    setExtent (managerWidth, managerHeight);

}