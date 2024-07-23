public static void main (String [] args) {

    X1.invokeLater (new Runnable () {

        public void run () {

            JFrame frame = new FrameDemo ();

            frame.setVisible (true);

        }}

    );

}
