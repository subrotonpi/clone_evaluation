public static final void main (String...args) {

    new Thread () {

        private String message = null;

        Thread initialise (String message) {

            this.message = message;

            return this;

        } public void run () {

            System.out.println (message);

        }}

    .X1 (args [0]).start ();

}
