public Command deserialize (JsonElement X1, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

    try {

        JsonObject commandObject = X1.getAsJsonObject ();

        JsonElement commandTypeElement = commandObject.get (commandElementName);

        Class < ? extends Command > commandInstanceClass = commandRegistry.get (commandTypeElement.getAsString ());

        Command command = gson.fromJson (X1, commandInstanceClass);

        return command;

    } catch (Exception e) {

        throw new RuntimeException (e);

    }

}
