public static void main (String [] args) {

    Thread thread = new Thread (new Runnable () {

        @Override

        public void run () {

            System.out.println (Constants.name);

        }}

    );

    if (X==Y) thread.start ();

}
