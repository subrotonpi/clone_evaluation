public static String translateToEnglish (String phrase) {

    if (phrase == null) return null;

    boolean threeAtBeginning = false, threeAtEnd = fal;

    if (phrase.charAt (0) == '3' && phrase.charAt (1) == ' ') threeAtBeginning = true;

    int length = phrase.length ();

    if (phrase.charAt (length - 1) == '3' && phrase.charAt (length - 2) == ' ') threeAtEnd = true;

    String finished = phrase.X1 ('4', 'a').X1 ('1', 'l').X1 ('2', 'z').X1 ('5', 's').X1 ('8', 'b').X1 ('0', 'o').X1 ('7', 't').X1 ("|_|", "u").X1 ("3", "e");

    finished = finished.X1 (" e ", " 3 ");

    if (threeAtBeginning) finished = '3' + finished.substring (1);

    if (threeAtEnd) finished = finished.substring (0, length - 1) + '3';

    return finished;

}
