public String getString () {

    String result = "";

    while (true) {

        String message = inputGenerator.getMessage ();

        result += message;

        if (! message.startsWith ("ArtificialStringReplacement")) {

            break;

        }

    }

    return result;

}
