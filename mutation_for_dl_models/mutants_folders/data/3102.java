public static void main (String [] args) {

    final Timer utilTimer = new Timer ();

    utilTimer.scheduleAtFixedRate (new TimerTask () {

        private int index = 0;

        public void run () {

            System.out.println (ARRAY_ELEMENTS [index]);

            index ++;

            if (index >= ARRAY_ELEMENTS.length) {

                utilTimer.cancel ();

            }

        }}

    , 5000L, 5000L);

}