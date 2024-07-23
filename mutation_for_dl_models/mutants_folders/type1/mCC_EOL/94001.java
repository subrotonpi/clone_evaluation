public String getString () {

    String result = "";

    while (true) {

        String message = inputGenerator.getMessage ();
 // EOL Comment
        result += message;

        if (! message.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
