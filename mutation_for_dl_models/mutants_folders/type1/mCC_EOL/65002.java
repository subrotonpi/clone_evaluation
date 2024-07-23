public static void main (String...args) {

    Runnable r1 = new Runnable () {

        int n;

        public void run () {

            System.out.println (++ n);
 // EOL Comment
        }}

    ;

    fourTimes (fiveTimes (fiveTimes (r1))).run ();

}
