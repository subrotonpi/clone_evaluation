public String getString () {

    String result = "";

    while (true) {

        String message = inputGenerator.getMessage (X1);

        result += message;

        if (! message.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
