public void serialize (Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {

    jgen.writeStartObject ();

    JavaType javaType = provider.constructType (CustomClass.class);

    BeanDescription beanDesc = provider.getConfig ().introspect (javaType);


    serializer.unwrappingSerializer (null).serialize (value, jgen, provider);

    jgen.writeObjectField ("my_extra_field", "some data");

    jgen.writeEndObject ();

}
