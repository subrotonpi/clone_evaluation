public static void main (String [] args) {

    WSObject wsObject = new WSObject (new Foo (new Bar (new Baz (3142))));

    WSObject wsObjectNull = new WSObject (new Foo (null));

    GetterResult < Integer > intResult = getterChain (wsObject, WSObject :: getFoo, Foo :: getBar, Bar :: getBar, Baz :: getInt);

    GetterResult < Integer > intResult2 = getterChain (wsObjectNull, WSObject :: getFoo, Foo :: getBar, Bar :: getBar, Baz :: getInt);

    System.out.println (intResult.result);

    System.out.println (intResult.lastIndex);

    System.out.println ();

    System.out.println (intResult2.result);

    System.out.println (intResult2.lastIndex);

}
