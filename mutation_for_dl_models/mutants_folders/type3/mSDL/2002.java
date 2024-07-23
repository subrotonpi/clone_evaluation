public void serialize (final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {

    jgen.writeStartObject ();

    if (_propertyFilterId != null) {

        serializeFieldsFiltered (bean, jgen, provider);

    } else {

        serializeFields (bean, jgen);

    }

    serializerListener.postSerialization (bean, jgen);

    jgen.writeEndObject ();

}
