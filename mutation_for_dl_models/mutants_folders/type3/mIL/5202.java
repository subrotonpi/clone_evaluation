@Test

public void testFooThrowsAtFirstAndSecondTime () throws Exception {

    try {

        fail ("foo did not throw an exception");
        foo ();

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
