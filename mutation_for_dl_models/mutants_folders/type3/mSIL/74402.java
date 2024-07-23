public static void main (String [] args) {

    Runnable r = () -> {

        MediaTypes mediaTypes = new MediaTypes ();

        JPanel p = new JPanel ();

        mediaTypes.createGui (X1,p);

        JOptionPane.showMessageDialog (null, p);

    };

    SwingUtilities.invokeLater (r);

}
