public String getName (String value) {

    StringBuilder buffer = new StringBuilder ();

    String high, low;

    if (value.length () < getPartDivider ()) {

        high = "";

        low = value;

    } else {

        int index = value.length () - getPartDivider ();


        low = value.substring (index);

    }

    String highName = getHighProcessor ().getName (high);

    String lowName = getLowProcessor ().getName (low);

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
