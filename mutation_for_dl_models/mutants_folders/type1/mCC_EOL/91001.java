public static void main (String [] args) {

    char [] num1 = "127".toCharArray ();

    char [] num2 = "32".toCharArray ();

    int [] intermediate = new int [num1.length];

    for (int i = 0;

    i < num1.length; i ++) {

        for (int j = 0;

        j < num2.length; j ++) {

            int d1 = num1 [num1.length - i - 1] - '0';

            int d2 = num2 [num2.length - j - 1] - '0';

            intermediate [i] += d1 * d2 * (int) Math.pow (10, j);

            System.out.printf ("  %d X %d = %d\n", d1, d2, intermediate [i]);

        }

        intermediate [i] *= (int) Math.pow (10, i);

        System.out.println (" intermediate : " + intermediate [i]);
 // EOL Comment
    }

    int sum = 0;

    for (int i : intermediate) {

        sum += i;

    }

    System.out.println ("Sum is = " + sum);

}
