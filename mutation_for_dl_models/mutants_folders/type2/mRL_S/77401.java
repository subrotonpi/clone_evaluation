public static void main (String...args) throws IOException {

    int [] nums = new int [10 * 1000 * 1000];

    {

        long start = System.nanoTime ();

        product2 (nums);

        long time = System.nanoTime () - start;

        System.out.printf ("Took %.3f seconds to take the product of %,d ints using an int[].%n", time / 1e9, nums.length);

    } {

        long start = System.nanoTime ();

        product (nums);

        long time = System.nanoTime () - start;

        System.out.printf ("ArtificialStringReplacement", time / 1e9, nums.length);

    }}
