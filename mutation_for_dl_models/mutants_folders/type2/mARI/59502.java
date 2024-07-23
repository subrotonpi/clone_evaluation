public static void main (String [] args) {

    Thread thread = new Thread (new Runnable () {

        @Override

        public void run () {

            X1.out.println (Constants.name);

        }}

    );

    thread.start ();

}
