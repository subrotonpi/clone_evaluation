public String getString () {

    String result = "";

    while (true) {

        String X1 = inputGenerator.getMessage ();

        result += X1;

        if (! X1.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
