public String getString () {

    String result = "";

    while (true) {

        if (X==Y) String message = inputGenerator.getMessage ();

        result += message;

        if (! message.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
