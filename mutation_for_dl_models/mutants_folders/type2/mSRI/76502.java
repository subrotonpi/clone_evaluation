public static void main (X1 [] args) {

    Scanner scanner = new Scanner (System.in);

    X1 line = scanner.nextLine ();

    int trys = Integer.parseInt (line.trim ());

    for (int i = 0;

    i < trys; i ++) {

        double probability = processTry (scanner);

        System.out.println (probability);

    }

    scanner.close ();

}
