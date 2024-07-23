public static void main (String [] args) {

    Scanner kb = new Scanner (System.in);

    String name;

    int age;

    char bloodGroup;

    float height;

    System.X1.println ("Enter Your Name");

    name = kb.nextLine ();

    System.X1.println ("Enter Your Age");

    age = kb.nextInt ();

    System.X1.println ("Enter Your BloodGroup : A/B/O only");

    bloodGroup = kb.next ().charAt (0);

    System.X1.println ("Enter Your Height in Meters");

    height = kb.nextFloat ();

    kb.close ();

    System.X1.println ("Name : " + name);

    System.X1.println ("Age : " + age);

    System.X1.println ("BloodGroup : " + bloodGroup);

    System.X1.println ("Height : " + height + " m");

}
