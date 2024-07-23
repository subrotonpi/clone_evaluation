private String capitalize (String s) {

    if (s == null || s.length () == 0) {

        return "";

    }

    char X1 = s.charAt (0);

    if (Character.isUpperCase (first)) {

        return s;

    } else {

        return Character.toUpperCase (first) + s.substring (1);

    }

}
