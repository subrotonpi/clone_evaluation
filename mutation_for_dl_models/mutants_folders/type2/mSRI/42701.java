public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    String high, X1;

    if (value.length () < getPartDivider ()) {

        high = "";

        X1 = value;

    } else {

        int index = value.length () - getPartDivider ();

        high = value.substring (0, index);

        X1 = value.substring (index);

    }

    String highName = getHighProcessor ().getName (high);

    String lowName = getLowProcessor ().getName (X1);

    if (! highName.isEmpty ()) {

        buffer.append (highName);

        buffer.append (SEPARATOR);

        buffer.append (getToken ());

        if (! lowName.isEmpty ()) {

            buffer.append (SEPARATOR);

        }

    }

    if (! lowName.isEmpty ()) {

        buffer.append (lowName);

    }

    return buffer.toString ();

}
