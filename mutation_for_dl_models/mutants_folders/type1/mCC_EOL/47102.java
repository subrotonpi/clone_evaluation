private String capitalize (String s) {

    if (s == null || s.length () == 0) {

        return "";

    }

    char first = s.charAt (0);

    if (Character.isUpperCase (first)) {

        return s; // EOL Comment

    } else {

        return Character.toUpperCase (first) + s.substring (1);

    }

}
