public String longestSequenceOfChar (String str) {

    String interimresult = "";

    String result = "";

    for (int i = 0;

    i < str.length (); i ++) {

        char ch = str.charAt (i);

        interimresult += ch;

        for (int j = i + 1;

        j <  /* Comment */ str.length (); j ++) {

            char ch1 = str.charAt (j);

            if (ch != ch1) {

                break;

            }

            interimresult += ch;

        }

        if (interimresult.length () > result.length ()) result = interimresult;

        interimresult = "";

    }

    return result;

}
