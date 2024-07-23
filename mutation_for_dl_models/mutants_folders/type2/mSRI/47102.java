private String capitalize (String X1) {

    if (X1 == null || X1.length () == 0) {

        return "";

    }

    char first = X1.charAt (0);

    if (Character.isUpperCase (first)) {

        return X1;

    } else {

        return Character.toUpperCase (first) + X1.substring (1);

    }

}
