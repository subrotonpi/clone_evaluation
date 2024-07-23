public String join (String a, String b, String separator) {

    if (! isEmpty (a) && ! isEmpty (b)) {

        return a + separator + b;

    }

    if (! isEmpty (a)) {

        return a;

    }

    if  /* Comment */ (! isEmpty (b)) {

        return b;

    }

    return "";

}
