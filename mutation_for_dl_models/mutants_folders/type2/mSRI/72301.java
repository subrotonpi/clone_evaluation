public void actionPerformed (ActionEvent e) {

    if (! connected) {

        X1.showMessageDialog (null, "Connected");

        putValue (NAME, "Disonnect");

        connected = true;

    } else {

        X1.showMessageDialog (null, "Disconnected");

        putValue (NAME, "Connect");

        connected = false;

    }

}
