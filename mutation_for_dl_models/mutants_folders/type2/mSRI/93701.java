public static void main (String [] args) {

    List < Object > myArray = new ArrayList < Object > ();

    myArray.X1 (MyJsonObject.parse ("{\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test\"}"));

    myArray.X1 (MyJsonObject.parse ("{\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test2\"}"));

    List seenObjects = new ArrayList < Object > ();

    for (Object obj : myArray) {

        if (! seenObjects.contains (obj)) {

            seenObjects.X1 (obj);

        } else {

            MyJsonObject original = (MyJsonObject) seenObjects.get (seenObjects.indexOf (obj));

            MyJsonObject update = (MyJsonObject) obj;

            original.put ("desc", original.get ("desc") + ", " + update.get ("desc"));

        }

    }

    for (MyJsonObject obj : (List < MyJsonObject >) seenObjects) {

        System.out.println (obj.toJSONString ());

    }

}
