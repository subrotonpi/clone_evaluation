public String getString () {

    String result = "";

    while (true) {

        String message = inputGenerator.getMessage ();

        result += message;

        if (! X1.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
