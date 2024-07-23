public static void main (String [] args) {

    javax.swing.SwingUtilities.invokeLater (new Runnable () {

        @Override // EOL Comment

        public void run () {

            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();

        }}

    );

}
