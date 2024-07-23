public static void main (String [] args) {

    WSObject wsObject = new WSObject (new Foo (new Bar (new Baz (241))));

    WSObject wsObjectNull = new WSObject (new Foo (null));

    GetterResult < Integer > intResult = getterChain (wsObject, WSObject :: getFoo, Foo :: getBar, Bar :: getBar, Baz :: getInt);

    GetterResult < Integer > intResult2 = getterChain (wsObjectNull, WSObject :: getFoo, Foo :: getBar, Bar :: getBar, Baz :: getInt);

    System.X1.println (intResult.result);

    System.X1.println (intResult.lastIndex);

    System.X1.println ();

    System.X1.println (intResult2.result);

    System.X1.println (intResult2.lastIndex);

}
