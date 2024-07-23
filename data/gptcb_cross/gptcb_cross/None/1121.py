def deserialize (json, typeOfT, context):
    jsonObject = json.get_asJsonObject ()
    prim = (JsonPrimitive) jsonObject.get (CLASSNAME)
    className = prim.get_asString ()
    klass = None
    try:
        klass = Class.forName (className)
    except ClassNotFoundException as e:
        e.printStackTrace ()
        raise JsonParseException (e.get_message ())
    return context.deserialize (jsonObject.get (INSTANCE), klass)