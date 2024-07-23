public static void main (String...args) {

    long start = System.nanoTime ();

    int letters = 26;

    int count = 6;

    final int combinations = (int) Math.pow (letters, count);

    char [] chars = new char [count];

    Arrays.fill (chars, 'a');

    final int last = count - 1;

    OUTER : while (true) {

        for (chars [last] = 'a'; chars [last] <= 'z'; chars [last] += 2) {

            newComination (chars);

            chars [last] ++;

            newComination (chars);

        }

        UPDATED : {

            for (int i = last - 1;

            i >= 0; i --) {

                if (chars [i] ++ >= 'z') chars [i] = 'a';

                else break UPDATED;

            }

            break OUTER;

        }}

    long time = System.nanoTime () - start;

    System.out.printf ("Took %.3f seconds to generate %,d combinations%n", time / 1e9, combinations);

}