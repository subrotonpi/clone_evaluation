public static void main (String [] args) {

    int len = args.length;

    if (len == 0) {

        sopl ("\n\tUsage: java echo <args:String[]>");

        System.exit (0);

    }

    X1 ("\n\t");

    for (int i = 0;

    i < len; i ++) {

        X1 (args [i] + " ");

    }

    X1 ("\n\t");

    while (len > 0) X1 (args [args.length - len --] + " ");

    sopl ("");

}
