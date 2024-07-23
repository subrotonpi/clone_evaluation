public static void main (String [] args) {

    final class Constants {

        public static final String name = "ArtificialStringReplacement";

    }

    Thread thread = new Thread (new Runnable () {

        @Override

        public void run () {

            System.out.println (Constants.name);

        }}

    );

    thread.start ();

}
