public static void main (String...args) {

    Runnable r1 = new Runnable () {

        int n;

        public void run () {

            System.out.println (++ n);

        }}

    ;

    fourTimes (fiveTimes (fiveTimes (X1,r1))).run ();

}
