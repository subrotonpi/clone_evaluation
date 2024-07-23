public static void main (String [] args) {


    FileReader fr = null;

    BufferedReader br = null;

    String [] stringArray;

    int counLine = 0;

    int arrayLength;

    String s = "";

    String stringLine = "";

    try {

        fr = new FileReader ("F:/Line.txt");

        br = new BufferedReader (fr);

        while ((s = br.readLine ()) != null) {

            stringLine = stringLine + s;

            stringLine = stringLine + " ";

            counLine ++;

        }

        System.out.println (stringLine);

        stringArray = stringLine.split (" ");

        arrayLength = stringArray.length;

        System.out.println ("The number of Words is " + arrayLength);

        for (int i = 0;

        i < arrayLength; i ++) {

            int c = 1;

            for (int j = i + 1;

            j < arrayLength; j ++) {

                if (stringArray [i].equalsIgnoreCase (stringArray [j])) {

                    c ++;

                    for (int j2 = j;

                    j2 < arrayLength; j2 ++) {

                        stringArray [j2] = stringArray [j2 + 1];

                        arrayLength = arrayLength - 1;

                    }

                }

            }

            System.out.println ("The " + stringArray [i] + " present " + c + " times .");

        }

        System.out.println ("The number of Line is " + counLine);

        System.out.println ();

        fr.close ();

        br.close ();

    } catch (Exception e) {

        e.printStackTrace ();

    }

}
