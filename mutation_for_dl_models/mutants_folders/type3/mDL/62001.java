public static void main (String...args) {

    final int MAX_VAL = 10000;

    int [] currentIndex = {0, 0, 0, 0};

    int [] remaining = {50, 50, 50, 50};

    int [] [] sequence = new int [4] [50];

    while (keepWorking (remaining)) {

        int currentMethod = chooseMethod (remaining);

        switch (currentMethod) {

            case 0 :

                sequence [currentMethod] [currentIndex [currentMethod]] = getLL (MAX_VAL);

                break;

            case 1 :

                sequence [currentMethod] [currentIndex [currentMethod]] = getAL (MAX_VAL);

                break;

            case 2 :

                sequence [currentMethod] [currentIndex [currentMethod]] = getLLIt (MAX_VAL);

                break;

            default :

                sequence [currentMethod] [currentIndex [currentMethod]] = getALIt (MAX_VAL);

                break;

        }

        remaining [currentMethod] --;

        currentIndex [currentMethod] ++;

    }

    for (int [] ar : sequence) {

        Arrays.sort (ar);

    }

    System.out.println ("Time (us\nLL    \tAL\tLL incr\t AL incr");

    for (int i = 0;

    i < sequence [0].length; i ++) {


    }

    System.out.println ("\nTime normalized to fastest run of a method\nLL\tAL\tLL incr\t AL incr");

    for (int i = 0;

    i < sequence [0].length; i ++) {

        System.out.print (i);

        for (int j = 0;

        j < sequence.length; j ++) {

            int a = sequence [j] [i] / (sequence [j] [0] / 100);

            System.out.print ("\t" + a);

        }

        System.out.println ();

    }

}
