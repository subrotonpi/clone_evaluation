public static void main (String...args) {

    Runnable r1 = new Runnable () {

        int X1;

        public void run () {

            System.out.println (++ X1);

        }}

    ;

    fourTimes (fiveTimes (fiveTimes (r1))).run ();

}
