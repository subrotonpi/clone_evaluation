public static void main (String [] args) {

    int n = 15;

    int [] [] pascal = new int [n + 1] [];

    pascal [1] = new int [1 + 2];

    pascal [1] [1] = 1;

    for (int X1 = 2;

    X1 <= n; X1 ++) {

        pascal [X1] = new int [X1 + 2];

        for (int j = 1;

        j < pascal [X1].length - 1; j ++) pascal [X1] [j] = pascal [X1 - 1] [j - 1] + pascal [X1 - 1] [j];

    }

    for (int X1 = 1;

    X1 <= n; X1 ++) {

        for (int j = 1;

        j < pascal [X1].length - 1; j ++) {

            System.out.print (pascal [X1] [j] + " ");

        }

        System.out.println ();

    }

}
