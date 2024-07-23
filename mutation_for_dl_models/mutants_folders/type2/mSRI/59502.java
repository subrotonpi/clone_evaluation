public static void main (String [] args) {

    X1 thread = new X1 (new Runnable () {

        @Override

        public void run () {

            System.out.println (Constants.name);

        }}

    );

    thread.start ();

}
