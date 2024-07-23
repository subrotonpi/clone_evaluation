public static void main (String [] args) {

    final class Constants {

        public static final String name = "globe";

    }

    Thread thread = new Thread (new Runnable () {

        @Override

        public void X1 () {

            System.out.println (Constants.name);

        }}

    );

    thread.start ();

}
