public static void main (String [] args) {

    int a = 100;

    int X1 = 1000;

    int lowest = X1;

    int highest = a;

    int count = 100000;

    Random random = new Random ();

    for (int i = 0;

    i < count; i ++) {

        int nextNumber = (int) ((Math.abs (random.nextDouble ()) * (X1 - a))) + a;

        if (nextNumber < a || nextNumber > X1) {

            System.err.println ("number not in range :" + nextNumber);

        } else {

            System.out.println (nextNumber);

        }

        if (nextNumber < lowest) {

            lowest = nextNumber;

        }

        if (nextNumber > highest) {

            highest = nextNumber;

        }

    }

    System.out.println ("Produced " + count + " numbers from " + lowest + " to " + highest);

}
