public void actionPerformed (ActionEvent e) {

    if (! connected) {

        JOptionPane.showMessageDialog (null, "Connected");


        connected = true;

    } else {

        JOptionPane.showMessageDialog (null, "Disconnected");

        putValue (NAME, "Connect");

        connected = false;

    }

}
