public static void main (String [] args,X1) {

    final class Constants {

        public static final String name = "globe";

    }

    Thread thread = new Thread (new Runnable () {

        @Override

        public void run () {

            System.out.println (Constants.name);

        }}

    );

    thread.start ();

}
