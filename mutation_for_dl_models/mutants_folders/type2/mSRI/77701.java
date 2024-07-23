@Override

public String toString () {

    StringBuilder X1 = new StringBuilder ("[");

    for (Field f : getClass ().getFields ()) {

        if (! isStaticField (f)) {

            try {

                X1.append (f.getName () + "=" + f.get (this) + " ");

            } catch (IllegalAccessException e) {

            }

        }

    }

    X1.append (']');

    return X1.toString ();

}
