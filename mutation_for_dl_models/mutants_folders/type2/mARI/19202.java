public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel (laf [index].getClassName ());

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception X1) {

        exc.printStackTrace ();

    }

    index = (index + 1) % laf.length;

}
