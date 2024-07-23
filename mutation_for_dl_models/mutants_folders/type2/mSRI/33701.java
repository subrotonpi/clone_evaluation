public static void main (String [] args) {

    String X1 = "abcdabghplhhnfl".toLowerCase ();

    Integer [] ar = new Integer [26];

    for (int i = 0;

    i < X1.length (); i ++) {

        int j = X1.charAt (i) - 'a';

        if (ar [j] == null) {

            ar [j] = 1;

        } else {

            ar [j] += 1;

        }

    }

    for (int i = 0;

    i < ar.length; i ++) {

        if (ar [i] != null && ar [i] > 1) {

            char c = (char) (97 + i);

            System.out.println ("'" + c + "' comes " + ar [i] + " times.");

        }

    }

}
