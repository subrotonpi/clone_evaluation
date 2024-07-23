public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    String X1, low;

    if (value.length () < getPartDivider ()) {

        X1 = "";

        low = value;

    } else {

        int index = value.length () - getPartDivider ();

        X1 = value.substring (0, index);

        low = value.substring (index);

    }

    String highName = getHighProcessor ().getName (X1);

    String lowName = getLowProcessor ().getName (low);

    if (! "".equals (highName)) {

        buffer.append (highName);

        buffer.append (SEPARATOR);

        buffer.append (getToken ());

        if (! "".equals (lowName)) {

            buffer.append (SEPARATOR);

        }

    }

    if (! "".equals (lowName)) {

        buffer.append (lowName);

    }

    return buffer.toString ();

}
