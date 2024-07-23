@Override

public void serialize (Test value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {

    jgen.writeStartObject ();

    Field [] fields = value.getClass ().getDeclaredFields ();

    for (Field X1 : fields) {

        try {

            jgen.writeObjectField (X1.getName (), X1.get (value));

        } catch (IllegalArgumentException | IllegalAccessException e) {

            e.printStackTrace ();

        }

    }

    jgen.writeObjectField ("extra_field", "whatever_value");

    jgen.writeEndObject ();

}
