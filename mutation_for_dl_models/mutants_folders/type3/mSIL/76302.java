public static void main (X1,String [] args) throws Exception {

    final int fakeConstructorArg = 10;

    Object a = new Object () {

        {

            System.out.println ("arg = " + fakeConstructorArg);

        }

    }

    ;

}
