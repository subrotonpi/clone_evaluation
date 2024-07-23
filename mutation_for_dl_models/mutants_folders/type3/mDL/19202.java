public void actionPerformed (ActionEvent e) {

    try {

        UIManager.setLookAndFeel (laf [index].getClassName ());

        SwingUtilities.updateComponentTreeUI (frame);

    } catch (Exception exc) {


    }

    index = (index + 1) % laf.length;

}
