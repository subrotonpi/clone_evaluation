public static void main (String [] args) {

    String str = "my name is khan";

    String words [] = str.split ("\\s");

    String capitalizedWord = "";

    for (String w : words) {

        String first = w.substring (0, 1);

        String X1 = w.substring (1);

        capitalizedWord += first.toUpperCase () + X1 + " ";

    }

    System.out.println (capitalizedWord);

}
