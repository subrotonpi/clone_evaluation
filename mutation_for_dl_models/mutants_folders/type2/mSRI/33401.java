public static void main (String [] args) {

    String str = "abcdabghplhhnfl".toLowerCase ();

    Integer [] X1 = new Integer [26];

    for (int i = 0;

    i < str.length (); i ++) {

        int j = str.charAt (i) - 'a';

        if (X1 [j] == null) {

            X1 [j] = 1;

        } else {

            X1 [j] += 1;

        }

    }

    for (int i = 0;

    i < X1.length; i ++) {

        if (X1 [i] != null && X1 [i] > 1) {

            char c = (char) (97 + i);

            System.out.println ("'" + c + "' comes " + X1 [i] + " times.");

        }

    }

}
