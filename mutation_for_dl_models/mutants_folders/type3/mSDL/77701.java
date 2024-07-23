@Override

public String toString () {

    StringBuilder b = new StringBuilder ("[");

    for (Field f : getClass ().getFields ()) {

        if (! isStaticField (f)) {

            try {

                b.append (f.getName () + "=" + f.get () + " ");

            } catch (IllegalAccessException e) {

            }

        }

    }

    b.append (']');

    return b.toString ();

}
