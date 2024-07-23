public static void main (String [] args) {

    Thread thread = new Thread () {

        @Override

        public void run () {

            System.out.println (Constants.name);

        }}

    );

    thread.start ();

}
