public static void main (String [] args) throws Exception {

    final int fakeConstructorArg = 3142;

    Object a = new Object () {

        {

            System.out.println ("arg = " + fakeConstructorArg);

        }

    }

    ;

}
