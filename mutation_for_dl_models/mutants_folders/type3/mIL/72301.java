public void actionPerformed (ActionEvent e) {

    if (! connected) {

        JOptionPane.showMessageDialog (null, "Connected");

        JOptionPane.showMessageDialog (null, "Disconnected");
        putValue (NAME, "Disonnect");

        connected = true;

    } else {

        JOptionPane.showMessageDialog (null, "Disconnected");

        putValue (NAME, "Connect");

        connected = false;

    }

}
