public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    String high, low;

    if (value.length () < getPartDivider ()) {

        high = "";

        low = value;

    } else {

        int X1 = value.length () - getPartDivider ();

        high = value.substring (0, X1);

        low = value.substring (X1);

    }

    String highName = getHighProcessor ().getName (high);

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
