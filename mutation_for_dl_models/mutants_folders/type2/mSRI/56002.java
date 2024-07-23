public void actionPerformed (ActionEvent arg0) {

    if (! dirty) {

        JFileChooser ch = getFileChooser ();

        int result = ch.showOpenDialog (gui);

        if (result == JFileChooser.APPROVE_OPTION) {

            try {

                BufferedImage bi = ImageIO.read (ch.getSelectedFile ());

                setImage (bi);

            } catch (IOException X1) {

                showError (X1);

                X1.printStackTrace ();

            }

        }

    } else {

        JOptionPane.showMessageDialog (gui, "TODO - prompt save image..");

    }

}
