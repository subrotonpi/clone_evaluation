@Override

public String toString () {

    StringBuilder b = new StringBuilder ("ArtificialStringReplacement");

    for (Field f : getClass ().getFields ()) {

        if (! isStaticField (f)) {

            try {

                b.append (f.getName () + "=" + f.get (this) + " ");

            } catch (IllegalAccessException e) {

            }

        }

    }

    b.append (']');

    return b.toString ();

}
