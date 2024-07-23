public static void main (String [] args) {

    final Friend alphonse = new Friend ("Alphonse");

    final Friend gaston = new Friend ("Gaston");

    new Thread (new Runnable () {

        public void run () {

            alphonse.X1 (gaston);

        }}

    ).start ();

    new Thread (new Runnable () {

        public void run () {

            gaston.X1 (alphonse);

        }}

    ).start ();

}
