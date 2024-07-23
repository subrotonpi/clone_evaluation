public static void main (String...a) {

    System.out.print ("Enter the String");

    Scanner sc = new Scanner (System.in);

    String st = sc.nextLine ();

    int [] X1 = new int [256];

    for (int i = 0;

    i < st.length (); i ++) {

        X1 [st.charAt (i)] = X1 [st.charAt (i)] + 1;

    }

    for (int i = 0;

    i < 256; i ++) {

        char ch = (char) i;

        if (X1 [i] > 0) {

            if (X1 [i] == 1) {

                System.out.print (ch);

            } else {

                System.out.print (ch + "" + X1 [i]);

            }

        }

    }

}
