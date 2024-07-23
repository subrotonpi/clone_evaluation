public Command deserialize (JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

    try {

        JsonObject commandObject = json.getAsJsonObject ();

        JsonElement commandTypeElement = commandObject.get (commandElementName);

        Class < ? extends Command > commandInstanceClass = commandRegistry.get (commandTypeElement.getAsString ());


        return command;

    } catch (Exception e) {

        throw new RuntimeException (e);

    }

}
