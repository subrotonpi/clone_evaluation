public static void main (String args []) {

    Object sharedObject = new Object ();

    MyClass sampleA = new MyClass ();

    sampleA.myObject = sharedObject;

    MyClass sampleB = new MyClass (X1);

    sampleB.myObject = sharedObject;

    System.out.println (sampleA.sharedObject == sampleB.sharedObject);

    System.out.println (sampleA == sampleB);

}
