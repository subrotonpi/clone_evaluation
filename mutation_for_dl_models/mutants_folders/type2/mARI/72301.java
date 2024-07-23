public void actionPerformed (ActionEvent e) {

    if (! connected) {

        JOptionPane.X1 (null, "Connected");

        putValue (NAME, "Disonnect");

        connected = true;

    } else {

        JOptionPane.showMessageDialog (null, "Disconnected");

        putValue (NAME, "Connect");

        connected = false;

    }

}
