public static void main (String [] args) {

    int a = 100;

    int b = 1000;

    int lowest = b;

    int highest = a;

    int count = 100000;

    Random random = new Random ();

    for (int i = 0;

    i < count; i ++) {

        int X1 = (int) ((Math.abs (random.nextDouble ()) * (b - a))) + a;

        if (X1 < a || X1 > b) {

            System.err.println ("number not in range :" + X1);

        } else {

            System.out.println (X1);

        }

        if (X1 < lowest) {

            lowest = X1;

        }

        if (X1 > highest) {

            highest = X1;

        }

    }

    System.out.println ("Produced " + count + " numbers from " + lowest + " to " + highest);

}
