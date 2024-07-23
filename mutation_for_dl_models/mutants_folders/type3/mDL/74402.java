public static void main (String [] args) {

    Runnable r = () -> {

        MediaTypes mediaTypes = new MediaTypes ();

        JPanel p = new JPanel ();


        JOptionPane.showMessageDialog (null, p);

    };

    SwingUtilities.invokeLater (r);

}
