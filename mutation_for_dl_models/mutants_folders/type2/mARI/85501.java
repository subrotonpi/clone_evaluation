public static void X1 (String [] args) {

    int a [] [] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

    int multiplier = 1;

    for (int i = 0;

    i < a.length; i ++) {

        multiplier = multiplier * a [i] [i];

    }

    System.out.println (multiplier);

}
