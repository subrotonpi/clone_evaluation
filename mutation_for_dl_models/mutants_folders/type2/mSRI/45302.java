public static void main (String [] args) {

    int len = args.length;

    if (len <= 0) {

        System.out.println (" ERROR: Please input a value of 1-5");

        System.exit (0);

    }

    int j;

    for (int X1 = 0;

    X1 <= len; X1 ++) {

        for (j = 0; j <= X1; j ++) System.out.print ("*");

        System.out.println ("");

    }

}