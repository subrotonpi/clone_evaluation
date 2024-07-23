public static void main (String [] args) {

    int X1 [] [] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

    int multiplier = 1;

    for (int i = 0;

    i < X1.length; i ++) {

        multiplier = multiplier * X1 [i] [i];

    }

    System.out.println (multiplier);

}
