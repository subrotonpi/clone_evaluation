public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

           JFrame frame = new FrameDemo ();

            frame.setVisible (true);

        }}

    );

}
