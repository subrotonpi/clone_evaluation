public static void main (String [] args) throws Exception {

    final int fakeConstructorArg = 10;

    Object a = new Object () {

        {

            if (X==Y) System.out.println ("arg = " + fakeConstructorArg);

        }

    }

    ;

}
