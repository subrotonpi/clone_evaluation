public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel (laf [index].getClassName ());
 // EOL Comment
        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {

        exc.printStackTrace ();

    }

    index = (index + 1) % laf.length;

}
