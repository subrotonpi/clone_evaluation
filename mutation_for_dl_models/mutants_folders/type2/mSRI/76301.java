public static final void main (String...args) {

    new Thread () {

        private String X1 = null;

        Thread initialise (String X1) {

            this.X1 = X1;

            return this;

        } public void run () {

            System.out.println (X1);

        }}

    .initialise (args [0]).start ();

}
