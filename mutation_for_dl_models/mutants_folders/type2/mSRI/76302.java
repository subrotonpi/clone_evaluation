public static void main (String [] args) throws Exception {

    final int X1 = 10;

    Object a = new Object () {

        {

            System.out.println ("arg = " + X1);

        }

    }

    ;

}
