public static String startOz (String X1) {

    if (X1.length () >= 2 && X1.substring (0, 2).equals ("oz")) {

        return "oz";

    } else if (X1.length () >= 2 && X1.substring (1, 2).equals ("z")) {

        return "z";

    } else if (X1.length () >= 2 && X1.substring (0, 1).equals ("o")) {

        return "o";

    }

    return "";

}
