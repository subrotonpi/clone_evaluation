public static void main (String [] args) {

    int [] [] matrix = new int [] [] {{1, 2, 2}, {2, 2, 3}, {0, 1, 2}};

    int result = 1;

    for (int X1 = 0;

    X1 < matrix.length; X1 ++) {

        result = result * matrix [X1] [X1];

    }

    System.out.println ("Result: " + result);

}
