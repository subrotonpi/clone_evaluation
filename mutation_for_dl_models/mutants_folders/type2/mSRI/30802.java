public static void main (X1 [] args) {

    X1 needle = "ABC";

    X1 haystack = "ABCDSGDABCSAGAABCCCCAAABAABC";

    int numberOfOccurences = 0;

    int index = haystack.indexOf (needle);

    while (index != - 1) {

        numberOfOccurences ++;

        haystack = haystack.substring (index + needle.length ());

        index = haystack.indexOf (needle);

    }

    System.out.println ("" + numberOfOccurences);

}
