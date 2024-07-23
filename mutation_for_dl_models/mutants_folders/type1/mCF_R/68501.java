public static void main (String [] args) {

    javax.swing.SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            try {

                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels ()) {

                    if ("Nimbus".equals (info.getName ())) {
                         UIManager.setLookAndFeel (info.getClassName ());

                        break;

                    }

                }

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {

                e.printStackTrace ();

            }

            Test test = new Test ();

        }}

    );

}
