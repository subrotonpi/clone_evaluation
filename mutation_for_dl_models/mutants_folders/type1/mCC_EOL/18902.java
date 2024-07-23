public static void main (String [] args) {

    final Friend alphonse = new Friend ("Alphonse");

    final Friend gaston = new Friend ("Gaston");

    new Thread (new Runnable () {

        public void run () {

            alphonse.bow (gaston);

        }}

    ).start ();

    new Thread (new Runnable () {

        public void run () {
 // EOL Comment
            gaston.bow (alphonse);

        }}

    ).start ();

}
