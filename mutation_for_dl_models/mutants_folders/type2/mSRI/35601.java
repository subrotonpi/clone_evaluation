public Object read (JsonReader X1) throws IOException {

    JsonToken token = X1.peek ();

    switch (token) {

        case BEGIN_ARRAY :

            List < Object > list = new ArrayList < Object > ();

            X1.beginArray ();

            while (X1.hasNext ()) {

                list.add (read (X1));

            }

            X1.endArray ();

            return list;

        case BEGIN_OBJECT :

            Map < String, Object > map = new LinkedTreeMap < String, Object > ();

            X1.beginObject ();

            while (X1.hasNext ()) {

                map.put (X1.nextName (), read (X1));

            }

            X1.endObject ();

            return map;

        case STRING :

            return X1.nextString ();

        case NUMBER :

            String n = X1.nextString ();

            if (n.indexOf ('.') != - 1) {

                return Double.parseDouble (n);

            }

            return Long.parseLong (n);

        case BOOLEAN :

            return X1.nextBoolean ();

        case NULL :

            X1.nextNull ();

            return null;

        default :

            throw new IllegalStateException ();

    }

}
