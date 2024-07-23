public static void main (String...args) {

    Runnable r1 = new Runnable () {

        int n;

        public void X1 () {

            System.out.println (++ n);

        }}

    ;

    fourTimes (fiveTimes (fiveTimes (r1))).X1 ();

}
