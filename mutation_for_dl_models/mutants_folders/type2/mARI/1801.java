public void serialize (Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {

    jgen.writeStartObject ();

    JavaType javaType = provider.constructType (CustomClass.class);

    BeanDescription beanDesc = provider.getConfig ().introspect (javaType);

    JsonSerializer < Object > serializer = BeanSerializerFactory.instance.findBeanSerializer (provider, javaType, beanDesc);

    serializer.unwrappingSerializer (null).serialize (X1, jgen, provider);

    jgen.writeObjectField ("my_extra_field", "some data");

    jgen.writeEndObject ();

}
