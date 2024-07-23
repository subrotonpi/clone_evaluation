public static void main (String args []) {

    Runnable threePrinter = new Runnable () {

        int i = 3;

        public void run () {

            System.out.println (i);

            i = i + 3;

        }}

    ;

    CyclicBarrier bar2 = new CyclicBarrier (1, threePrinter);

    X1 twoPrinter = new X1 (bar2);

    CyclicBarrier bar1 = new CyclicBarrier (1, twoPrinter);

    Thread onePrinter = new Thread (new one (bar1));

    onePrinter.start ();

}
