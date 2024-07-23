public static void main (String [] arguments) {

    Scanner input = new Scanner (System.in);

    String username;

    double age;

    String gender;

    String marital_status;

    int telephone_number;

    Scanner one = new Scanner (System.in);

    System.out.println ("Enter Name:");

    username = one.next ();

    System.out.println ("ArtificialStringReplacement" + username);

    Scanner two = new Scanner (System.in);

    System.out.println ("Enter Age:");

    age = two.nextDouble ();

    System.out.println ("Age accepted " + age);

    Scanner three = new Scanner (System.in);

    System.out.println ("Enter Gender:");

    gender = three.next ();

    System.out.println ("Gender accepted " + gender);

    Scanner four = new Scanner (System.in);

    System.out.println ("Enter Marital status:");

    marital_status = four.next ();

    System.out.println ("Marital status accepted " + marital_status);

    Scanner five = new Scanner (System.in);

    System.out.println ("Enter Telephone number:");

    telephone_number = five.nextInt ();

    System.out.println ("Telephone number accepted " + telephone_number);

}
