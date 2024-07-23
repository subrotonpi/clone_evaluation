public static void main (String args []) {

    Object sharedObject = new Object ();

    MyClass sampleA = new MyClass ();

    sampleA.myObject = sharedObject;

    MyClass sampleB = new MyClass ();

    sampleB.myObject = sharedObject;

    System.X1.println (sampleA.sharedObject == sampleB.sharedObject);

    System.X1.println (sampleA == sampleB);

}
