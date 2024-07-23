public static void main (String [] args) {

    final Timer X1 = new Timer ();

    X1.scheduleAtFixedRate (new TimerTask () {

        private int index = 0;

        public void run () {

            System.out.println (ARRAY_ELEMENTS [index]);

            index ++;

            if (index >= ARRAY_ELEMENTS.length) {

                X1.cancel ();

            }

        }}

    , 5000L, 5000L);

}
