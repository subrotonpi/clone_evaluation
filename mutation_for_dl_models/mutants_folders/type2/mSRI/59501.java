public static void main (String [] args) {

    final class Constants {

        public static final String X1 = "globe";

    }

    Thread thread = new Thread (new Runnable () {

        @Override

        public void run () {

            System.out.println (Constants.X1);

        }}

    );

    thread.start ();

}
