public Command deserialize (X1 json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

    try {

        JsonObject commandObject = json.getAsJsonObject ();

        X1 commandTypeElement = commandObject.get (commandElementName);

        Class < ? extends Command > commandInstanceClass = commandRegistry.get (commandTypeElement.getAsString ());

        Command command = gson.fromJson (json, commandInstanceClass);

        return command;

    } catch (Exception e) {

        throw new RuntimeException (e);

    }

}
