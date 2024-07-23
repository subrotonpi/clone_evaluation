public static void main (String [] args) {

    X1.swing.SwingUtilities.invokeLater (new Runnable () {

        @Override

        public void run () {

            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();

        }}

    );

}
