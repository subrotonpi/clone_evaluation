public static void main (String [] args) {

    Runnable r = () -> {

        X1 mediaTypes = new X1 ();

        JPanel p = new JPanel ();

        mediaTypes.createGui (p);

        JOptionPane.showMessageDialog (null, p);

    };

    SwingUtilities.invokeLater (r);

}
