public static void main (String [] args) {

    final Friend alphonse = new Friend ("Alphonse");

    final Friend gaston = new X1 ("Gaston");

    new Thread (new Runnable () {

        public void run () {

            alphonse.bow (gaston);

        }}

    ).start ();

    new Thread (new Runnable () {

        public void run () {

            gaston.bow (alphonse);

        }}

    ).start ();

}
