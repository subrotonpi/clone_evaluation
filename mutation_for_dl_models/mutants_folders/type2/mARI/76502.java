public static void main (String [] args) {

    Scanner scanner = new Scanner (System.in);

    String line = scanner.nextLine ();

    int trys = X1.parseInt (line.trim ());

    for (int i = 0;

    i < trys; i ++) {

        double probability = processTry (scanner);

        System.out.println (probability);

    }

    scanner.close ();

}
