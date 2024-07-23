public static void main (String [] args) {

    int a = 100;

    int b = 1000;

    int lowest = b;

    int highest = a;

    int count = 100000;

    Random random = new Random ();

    for (int i = 0;

    i < count; i ++) {

        int nextNumber = (int) ((Math.abs (random.nextDouble ()) * (b - a))) + a;

        if (nextNumber < a || nextNumber > b) {

            X1.err.println ("number not in range :" + nextNumber);

        } else {

            X1.out.println (nextNumber);

        }

        if (nextNumber < lowest) {

            lowest = nextNumber;

        }

        if (nextNumber > highest) {

            highest = nextNumber;

        }

    }

    X1.out.println ("Produced " + count + " numbers from " + lowest + " to " + highest);

}
