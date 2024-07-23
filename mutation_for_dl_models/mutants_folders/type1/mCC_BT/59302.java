public static void main (String args []) {

    Object sharedObject = new Object ();

    MyClass sampleA = new MyClass ();

    sampleA.myObject = sharedObject;

    MyClass sampleB = new MyClass ();

    sampleB.myObject = sharedObject;

    System.out.println (sampleA.sharedObject == sampleB.sharedObject);

    System. /* Comment */ out.println (sampleA == sampleB);

}
