public static void main (String [] args) throws IOException {

    String ch;

    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    System.out.print ("Enter the Statement:");

    ch = br.readLine ();

    int count = 0, len = 0;

    do {

        try {

            char X1 [] = ch.toCharArray ();

            len = X1.length;

            count = 0;

            for (int j = 0;

            j < len; j ++) {

                if ((X1 [0] == X1 [j]) && ((X1 [0] >= 65 && X1 [0] <= 91) || (X1 [0] >= 97 && X1 [0] <= 123))) count ++;

            }

            if (count != 0) System.out.println (X1 [0] + " " + count + " Times");

            ch = ch.replace ("" + X1 [0], "");

        } catch (Exception ex) {

        }

    } while (len != 1);

}
