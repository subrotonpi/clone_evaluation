public void serialize (final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {

    jgen.writeStartObject ();

    if (_propertyFilterId != null) {

        serializeFieldsFiltered (jgen, provider);

    } else {

        serializeFields (bean, jgen, provider);

    }

    serializerListener.postSerialization (bean, jgen);

    jgen.writeEndObject ();

}
