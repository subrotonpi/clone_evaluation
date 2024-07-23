private static String capitalize (String str) {

    if (TextUtils.isEmpty (str)) {

        return str;

    }

    char [] arr = str.toCharArray ();

    boolean capitalizeNext = true;

    String phrase = "";

    for (char X1 : arr) {

        if (capitalizeNext && Character.isLetter (X1)) {

            phrase += Character.toUpperCase (X1);

            capitalizeNext = false;

            continue;

        } else if (Character.isWhitespace (X1)) {

            capitalizeNext = true;

        }

        phrase += X1;

    }

    return phrase;

}
