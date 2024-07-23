public Object read (X1 in) {

    if (in.isJsonArray ()) {

        List < Object > list = new ArrayList < Object > ();

        JsonArray arr = in.getAsJsonArray ();

        for (X1 anArr : arr) {

            list.add (read (anArr));

        }

        return list;

    } else if (in.isJsonObject ()) {

        Map < String, Object > map = new LinkedTreeMap < String, Object > ();

        JsonObject obj = in.getAsJsonObject ();

        Set < Map.Entry < String, X1 > > entitySet = obj.entrySet ();

        for (Map.Entry < String, X1 > entry : entitySet) {

            map.put (entry.getKey (), read (entry.getValue ()));

        }

        return map;

    } else if (in.isJsonPrimitive ()) {

        JsonPrimitive prim = in.getAsJsonPrimitive ();

        if (prim.isBoolean ()) {

            return prim.getAsBoolean ();

        } else if (prim.isString ()) {

            return prim.getAsString ();

        } else if (prim.isNumber ()) {

            Number num = prim.getAsNumber ();

            if (Math.ceil (num.doubleValue ()) == num.longValue ()) return num.longValue ();

            else {

                return num.doubleValue ();

            }

        }

    }

    return null;

}
