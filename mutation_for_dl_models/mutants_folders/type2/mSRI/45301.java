public static void main (String [] X1) {

    int len = X1.length;

    if (len == 0) {

        sopl ("\n\tUsage: java echo <args:String[]>");

        System.exit (0);

    }

    sop ("\n\t");

    for (int i = 0;

    i < len; i ++) {

        sop (X1 [i] + " ");

    }

    sop ("\n\t");

    while (len > 0) sop (X1 [X1.length - len --] + " ");

    sopl ("");

}
