public static void main (String...args) {

    Runnable r1 = new Runnable () {

       /* Comment */   int n;

        public void run () {

            System.out.println (++ n);

        }}

    ;

    fourTimes (fiveTimes (fiveTimes (r1))).run ();

}