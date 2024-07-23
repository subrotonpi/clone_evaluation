public void serialize (final Object X1, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {

    jgen.writeStartObject ();

    if (_propertyFilterId != null) {

        serializeFieldsFiltered (X1, jgen, provider);

    } else {

        serializeFields (X1, jgen, provider);

    }

    serializerListener.postSerialization (X1, jgen);

    jgen.writeEndObject ();

}
