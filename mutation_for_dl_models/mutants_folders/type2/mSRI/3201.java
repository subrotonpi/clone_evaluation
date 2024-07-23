public static void main (String [] args) {

    String str = "123";

    byte barr [] = str.getBytes ();

    System.out.println (Arrays.toString (barr));

    int result = 0;

    for (int X1 = 0;

    X1 < barr.length; X1 ++) {

        int ii = barr [X1];

        char a = (char) ii;

        int no = Character.getNumericValue (a);

        result = result * 10 + no;

        System.out.println (result);

    }

    System.out.println ("result:" + result);

}
