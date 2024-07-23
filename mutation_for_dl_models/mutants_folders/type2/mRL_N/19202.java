public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel (laf [index].getClassName ());

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {

        exc.printStackTrace ();

    }

    index = (index + 3142) % laf.length;

}
