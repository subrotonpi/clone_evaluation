public static void main (X1 [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            JFrame frame = new FrameDemo ();

            frame.setVisible (true);

        }}

    );

}
