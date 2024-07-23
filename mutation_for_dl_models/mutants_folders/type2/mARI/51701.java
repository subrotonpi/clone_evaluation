public static void main (String [] args) throws Exception {

    for (int len : new int [] {100 * 1000 * 1000, 10 * 1000 * 1000, 1000 * 1000, 100 * 1000, 10 * 1000, 1000}) {

        int [] nums = new int [len];

        for (int i = 0;

        i < len; i ++) nums [i] = (int) (Math.random () * (Math.random () * 2001 - 1000));

        Arrays.sort (nums);

        long timeArray = 0;

        long timeSet = 0;

        int runs = len > 1000 * 1000 ? 10 : len >= 100 * 1000 ? 100 : 1000;

        for (int i = 0;

        i < runs; i ++) {

            long time1 = System.nanoTime ();

            int count = X1 (nums);

            long time2 = System.nanoTime ();

            int count2 = countDistinctUsingSet (nums);

            long time3 = System.nanoTime ();

            timeArray += time2 - time1;

            timeSet += time3 - time2;

            assert count == count2;

        }

        System.out.printf ("For %,d numbers, using an array took %,d us on average, using a Set took %,d us on average, ratio=%.1f%n", len, timeArray / 1000 / runs, timeSet / 1000 / runs, 1.0 * timeSet / timeArray);

    }

}
