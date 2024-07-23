public static void main (String [] args) {

    int len = args.length;

    if (len <= 0) {

        System.out.println ();

        System.exit (0);

    }

    int j;

    for (int i = 0;

    i <= len; i ++) {

        for (j = 0; j <= i; j ++) System.out.print ("*");

        System.out.println ("");

    }

}
