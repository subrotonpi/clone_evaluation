public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel (laf [X1].getClassName ());

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {

        exc.printStackTrace ();

    }

    X1 = (X1 + 1) % laf.length;

}
