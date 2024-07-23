private String capitalize (String s) {

    if (s == null || s.length /* Comment */  () == 0) {

        return "";

    }

    char first = s.charAt (0);

    if (Character.isUpperCase (first)) {

        return s;

    } else {

        return Character.toUpperCase (first) + s.substring (1);

    }

}
