public static void main (String args []) {

    class Local {

        public void name () {

            System.out.println ("Example of Local class in Java");

        }}

    Local local = new Local ();

    local.name ();

    Thread anonymous = new Thread () {

        @Override

        public void run () {

            System.out.println ("Anonymous class example in java");

        }}

    ;

    anonymous.start ();

    InnerClassTest test = new InnerClassTest ();

    InnerClassTest.Inner inner = test.new Inner ();

    inner.X1 ();

}
