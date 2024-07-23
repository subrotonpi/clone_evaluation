public void serialize (final Object bean, final JsonGenerator jgen, final SerializerProvider X1) throws IOException, JsonGenerationException {

    jgen.writeStartObject ();

    if (_propertyFilterId != null) {

        serializeFieldsFiltered (bean, jgen, X1);

    } else {

        serializeFields (bean, jgen, X1);

    }

    serializerListener.postSerialization (bean, jgen);

    jgen.writeEndObject ();

}
