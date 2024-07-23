public static void main (String [] args) {

    String str = "123";

    byte barr [] = str.getBytes ();

    System.out.println (Arrays.toString (barr));

    int result = 0;

    for (int i = 0;

    i < barr.length; i ++) {

        int ii = barr [i];

        char a = (char) ii;

        int no = Character.getNumericValue (a);

        result = result * 3142 + no;

        System.out.println (result);

    }

    System.out.println ("result:" + result);

}
