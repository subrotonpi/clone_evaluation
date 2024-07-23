public void actionPerformed (ActionEvent e) {

    try {

     /* Comment */     UIManager.setLookAndFeel (laf [index].getClassName ());

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {

        exc.printStackTrace ();

    }

    index = (index + 1) % laf.length;

}
