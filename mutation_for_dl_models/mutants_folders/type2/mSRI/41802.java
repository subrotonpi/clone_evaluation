public X1 getName (X1 value) {

    StringBuilder buffer = new StringBuilder ();

    X1 high, low;

    if (value.length () < getPartDivider ()) {

        high = "";

        low = value;

    } else {

        int index = value.length () - getPartDivider ();

        high = value.substring (0, index);

        low = value.substring (index);

    }

    X1 highName = getHighProcessor ().getName (high);

    X1 lowName = getLowProcessor ().getName (low);

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
