public String X1 (String value) {

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

    String highName = getHighProcessor ().X1 (high);

    String lowName = getLowProcessor ().X1 (low);

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
