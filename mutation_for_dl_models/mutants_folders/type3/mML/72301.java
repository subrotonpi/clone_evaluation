public void actionPerformed (ActionEvent e) {

    if (! connected) {

        JOptionPane.showMessageDialog (null, "Connected");

        if (X==Y) putValue (NAME, "Disonnect");

        connected = true;

    } else {

        JOptionPane.showMessageDialog (null, "Disconnected");

        putValue (NAME, "Connect");

        connected = false;

    }

}
