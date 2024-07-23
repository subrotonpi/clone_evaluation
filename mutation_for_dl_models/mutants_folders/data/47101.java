private static String capitalize (String str) {

    if (TextUtils.isEmpty (str)) {

        return str;

    }

    char [] arr = str.toCharArray ();

    boolean capitalizeNext = true;

    String phrase = "";

    for (char c : arr) {

        if (capitalizeNext && Character.isLetter (c)) {

            phrase += Character.toUpperCase (c);

            capitalizeNext = false;

            continue;

        } else if (Character.isWhitespace (c)) {

            capitalizeNext = true;

        }

        phrase += c;

    }

    return phrase;

}