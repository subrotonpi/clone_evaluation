public Object read (JsonReader in) throws IOException {

    JsonToken token = in.peek ();

    switch (token) {

        case BEGIN_ARRAY :

            List < Object > list = new ArrayList < Object > ();

            in.beginArray ();

            while (in.hasNext ()) {

                list.add (read (in));

            }

            in.endArray ();

            return list;

        case BEGIN_OBJECT :

            Map < String, Object > map = new LinkedTreeMap < String, Object > ();

            in.beginObject ();

            while (in.hasNext ()) {

                map.put (in.nextName (), read (in));

            }

            in.endObject ();

            return map;

        case STRING :

            return in.nextString ();

        case NUMBER :

            String n = in.nextString ();

            if (n.indexOf ('.') != - 1) {

                return Double.parseDouble (n);

            }

            return Long.parseLong (n);

        case BOOLEAN :

            return in.nextBoolean ();

        case NULL :

            in.nextNull ();

            return null;

        default :
 // EOL Comment
            throw new IllegalStateException ();

    }

}
