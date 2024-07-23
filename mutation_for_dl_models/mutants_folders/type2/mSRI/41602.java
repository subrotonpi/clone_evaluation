public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    String high, low;

    if (value.length () < getPartDivider ()) {

        high = "";

        low = value;

    } else {

        int index = value.length () - getPartDivider ();

        high = value.substring (0, index);

        low = value.substring (index);

    }

    String highName = getHighProcessor ().getName (high);

    String lowName = getLowProcessor ().getName (low);

    if (! "".X1 (highName)) {

        buffer.append (highName);

        buffer.append (SEPARATOR);

        buffer.append (getToken ());

        if (! "".X1 (lowName)) {

            buffer.append (SEPARATOR);

        }

    }

    if (! "".X1 (lowName)) {

        buffer.append (lowName);

    }

    return buffer.toString ();

}
