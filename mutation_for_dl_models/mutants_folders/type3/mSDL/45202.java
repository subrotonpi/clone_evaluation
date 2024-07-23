public static void main (String [] args) {

    int len = args.length;

    if (len == 0) {

        sopl ("\n\tUsage: java echo <args:String[]>");

        System.exit (0);

    }

    sop ();

    for (int i = 0;

    i < len; i ++) {

        sop (args [i] + " ");

    }

    sop ("\n\t");

    while (len > 0) sop (args [args.length - len --] + " ");

    sopl ("");

}
