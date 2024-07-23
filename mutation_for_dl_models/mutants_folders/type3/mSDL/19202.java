public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel ();

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {

        exc.printStackTrace ();

    }

    index = (index + 1) % laf.length;

}
