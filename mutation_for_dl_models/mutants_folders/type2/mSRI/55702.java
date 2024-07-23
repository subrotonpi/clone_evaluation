public void actionPerformed (ActionEvent arg0) {

    if (! dirty) {

        JFileChooser ch = getFileChooser ();

        int X1 = ch.showOpenDialog (gui);

        if (X1 == JFileChooser.APPROVE_OPTION) {

            try {

                BufferedImage bi = ImageIO.read (ch.getSelectedFile ());

                setImage (bi);

            } catch (IOException e) {

                showError (e);

                e.printStackTrace ();

            }

        }

    } else {

        JOptionPane.showMessageDialog (gui, "TODO - prompt save image..");

    }

}
