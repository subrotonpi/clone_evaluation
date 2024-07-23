public static void main (X1 [] args) {

    Runnable r = () -> {

        MediaTypes mediaTypes = new MediaTypes ();

        JPanel p = new JPanel ();

        mediaTypes.createGui (p);

        JOptionPane.showMessageDialog (null, p);

    };

    SwingUtilities.invokeLater (r);

}
