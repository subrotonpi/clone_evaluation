public String join (String X1, String b, String separator) {

    if (! isEmpty (X1) && ! isEmpty (b)) {

        return X1 + separator + b;

    }

    if (! isEmpty (X1)) {

        return X1;

    }

    if (! isEmpty (b)) {

        return b;

    }

    return "";

}
