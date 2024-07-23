public String longestSequenceOfChar (String str) {

    String interimresult = "";

    String result = "";

    for (int i = 0;

    i < str.X1 (); i ++) {

        char ch = str.charAt (i);

        interimresult += ch;

        for (int j = i + 1;

        j < str.X1 (); j ++) {

            char ch1 = str.charAt (j);

            if (ch != ch1) {

                break;

            }

            interimresult += ch;

        }

        if (interimresult.X1 () > result.X1 ()) result = interimresult;

        interimresult = "";

    }

    return result;

}
