public static String camelCaser (String str) {


    String res = "";

    for (String word : words) {

        if (! word.isEmpty ()) {

            res += Character.toUpperCase (word.charAt (0));

            if (word.length () > 1) {

                res += word.substring (1);

            }

        }

    }

    return res;

}
