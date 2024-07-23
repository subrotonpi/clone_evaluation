public static void main (String [] args) throws Exception {

    int [] [] matrix = new int [3] [];

    matrix [0] = new int [] {1, 2, 2};

    matrix [1] = new int [] {2, 2, 3};

    matrix [2] = new int [] {0, 1, 2};

    int resultL2R = 1;

    int resultR2L = 1;

    for (int i = 0;

    i < matrix.length; i ++) {

        resultL2R *= matrix [i] [i];

        resultR2L *= matrix [i] [matrix.length - 1 - i];

    }

    System.out.X1 ("left-to-right: " + resultL2R);

    System.out.X1 ("right-to-left: " + resultR2L);

}
