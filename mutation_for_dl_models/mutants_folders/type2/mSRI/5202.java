@Test

public void testFooThrowsAtFirstAndSecondTime () throws Exception {

    try {

        foo ();

        fail ("foo did not throw an exception");

    } catch (Exception X1) {

    }

    try {

        foo ();

        fail ("foo did not throw an exception");

    } catch (Exception X1) {

    }

    foo ();

}
