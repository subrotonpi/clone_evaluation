def deserialize(json, typeOfT, context):
    jsonObject = json.get_as_json_object()
    prim = jsonObject.get(CLASSNAME)
    className = prim.get_as_string()
    klass = None
    try: 
        klass = Class.for_name(className)
    except ClassNotFoundException as e:
        e.print_stack_trace()
        raise JsonParseException(e.get_message())
    return context.deserialize(jsonObject.get(INSTANCE), klass)