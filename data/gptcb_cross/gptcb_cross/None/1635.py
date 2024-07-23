def serialize(bean, jgen, provider):
    jgen.writeStartObject()

    if _propertyFilterId is not None:
        serializeFieldsFiltered(bean, jgen, provider)
    else:
        serializeFields(bean, jgen, provider)
    
    serializerListener.postSerialization(bean, jgen)
    jgen.writeEndObject()