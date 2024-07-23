public void actionPerformed (ActionEvent arg0) {

    if (! dirty) {

        JFileChooser ch = getFileChooser ();

        int result = ch.showOpenDialog (X1);

        if (result == JFileChooser.APPROVE_OPTION) {

            try {

                BufferedImage bi = ImageIO.read (ch.getSelectedFile ());

                setImage (bi);

            } catch (IOException e) {

                showError (e);

                e.printStackTrace ();

            }

        }

    } else {

        JOptionPane.showMessageDialog (X1, "TODO - prompt save image..");

    }

}
