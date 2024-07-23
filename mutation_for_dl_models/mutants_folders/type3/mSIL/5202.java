@Test

public void testFooThrowsAtFirstAndSecondTime () throws Exception {

    try {

        foo (X1);

        fail ("foo did not throw an exception");

    } catch (Exception ex) {

    }

    try {

        foo ();

        fail ("foo did not throw an exception");

    } catch (Exception ex) {

    }

    foo ();

}
