public static void  main (String [] args) {

    String str = "my name is khan";

    String words [] = str.split ("\\s");

    String capitalizedWord = "";

    for (String w : words) {

        String first = w.substring (0, 1);

        String f_after = w.substring (1);

        capitalizedWord += first.toUpperCase () + f_after + " ";

    }

    System.out.println (capitalizedWord);

}
