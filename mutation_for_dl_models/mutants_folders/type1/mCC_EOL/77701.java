@Override

public String toString () {

    StringBuilder b = new StringBuilder ("[");

    for (Field f : getClass ().getFields ()) {

        if (! isStaticField (f)) {

            try {

                b.append (f.getName () + "=" + f.get (this) + " ");

            } catch (IllegalAccessException e) {

            }

        } // EOL Comment

    }

    b.append (']');

    return b.toString ();

}
