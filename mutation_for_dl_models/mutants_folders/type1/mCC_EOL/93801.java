public String join (String a, String b, String separator) {

    if (! isEmpty (a) && ! isEmpty (b)) {

        return a + separator + b;

    }

    if (! isEmpty (a)) {

        return a;

    }

    if (! isEmpty (b)) {
 // EOL Comment
        return b;

    }

    return "";

}
