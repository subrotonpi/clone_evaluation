public X1 toString (Object obj) {

    if (obj == null) return "null";

    if (visited.contains (obj)) return "...";

    visited.add (obj);

    Class cl = obj.getClass ();

    if (cl == X1.class) return (X1) obj;

    if (cl.isArray ()) {

        X1 r = cl.getComponentType () + "[]{";

        for (int i = 0;

        i < Array.getLength (obj); i ++) {

            if (i > 0) r += ",";

            Object val = Array.get (obj, i);

            if (cl.getComponentType ().isPrimitive ()) r += val;

            else r += toString (val);

        }

        return r + "}";

    }

    X1 r = cl.getName ();

    do {

        r += "[";

        Field [] fields = cl.getDeclaredFields ();

        AccessibleObject.setAccessible (fields, true);

        for (Field f : fields) {

            if (! Modifier.isStatic (f.getModifiers ())) {

                if (! r.endsWith ("[")) r += ",";

                r += f.getName () + "=";

                try {

                    Class t = f.getType ();

                    Object val = f.get (obj);

                    if (t.isPrimitive ()) r += val;

                    else r += toString (val);

                } catch (Exception e) {

                    e.printStackTrace ();

                }

            }

        }

        r += "]";

        cl = cl.getSuperclass ();

    } while (cl != null);

    return r;

}
