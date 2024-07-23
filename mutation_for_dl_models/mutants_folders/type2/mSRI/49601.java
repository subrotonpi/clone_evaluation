public static void main (String [] args) {

    char [] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray ();

    final int X1 = (chars.length + 1) / 2;

    System.out.println ("Mid: " + X1);

    System.out.println ("Start : " + new String (chars));

    if ((chars.length % 2) == 1) {

        char first = chars [0];

        for (int l = 1, r = X1;

        r < chars.length; l ++, r ++) {

            chars [l - 1] = chars [r];

            chars [r] = chars [l];

        }

        chars [X1 - 1] = first;

    } else {

        for (int l = 0, r = X1;

        r < chars.length; l ++, r ++) {

            swap (chars, l, r);

        }

    }

    System.out.println ("Pass 1: " + new String (chars));

    swap (chars, 0, chars.length - 2);

    swap (chars, 1, chars.length - 1);

    System.out.println ("Pass 2: " + new String (chars));

    swap (chars, X1 - 1, X1 + 1);

    swap (chars, X1 - 2, X1);

    System.out.println ("Pass 3: " + new String (chars));

}
