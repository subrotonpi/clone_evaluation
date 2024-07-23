public static void main (String [] args) {

    int size = 10;

    double skew = 2.0;

    ZipfGenerator z0 = new ZipfGenerator (size, skew);

    FastZipfGenerator z1 = new FastZipfGenerator (size, skew);

    long before = 0;

    long after = 0;

    int n = 5000000;

    before = System.nanoTime ();

    Map < Integer, Integer > counts0 = computeCounts (z0, size, n);

    after = System.nanoTime ();

    System.out.println (counts0 + ", duration " + (after - before) / 1e6);

    before = System.nanoTime ();

    Map < Integer, Integer > X1 = computeCounts (z1, size, n);

    after = System.nanoTime ();

    System.out.println (X1 + ", duration " + (after - before) / 1e6);

}
