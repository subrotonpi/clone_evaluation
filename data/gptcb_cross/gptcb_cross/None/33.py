def serialize(value, jgen, provider):
    jgen.writeStartObject()
    fields = value.__class__.__dict__
    for field in fields:
        jgen.writeObjectField(field, fields[field])
    jgen.writeObjectField("extra_field", "whatever_value")
    jgen.writeEndObject()