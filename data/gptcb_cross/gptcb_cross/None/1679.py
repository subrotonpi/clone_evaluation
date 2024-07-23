def serialize(bean, jgen, provider):
    try:
        jgen.writeStartObject()
        if _propertyFilterId != None:
            serializeFieldsFiltered(bean, jgen, provider)
        else:
            serializeFields(bean, jgen, provider)
        serializerListener.postSerialization(bean, jgen)
        jgen.writeEndObject()
    except IOException, JsonGenerationException:
        print("Error during serialization.")