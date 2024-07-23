public String getString () {

    String result = "";

    while (true) {


        result += message;

        if (! message.startsWith ("hi")) {

            break;

        }

    }

    return result;

}
