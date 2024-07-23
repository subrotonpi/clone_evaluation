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
