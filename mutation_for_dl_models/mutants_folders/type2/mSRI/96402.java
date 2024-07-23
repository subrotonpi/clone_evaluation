public static void main (String [] args) {

    int count = 0;

    String str = "hi this is is is line";

    String [] X1 = str.split (" ");

    for (int i = 0;

    i <= X1.length - 1; i ++) {

        if (X1 [i].equals ("is")) {

            count ++;

        }

    }

    System.out.println (count);

}
