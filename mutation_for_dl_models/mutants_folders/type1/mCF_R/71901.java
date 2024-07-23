public static void main (String args []) throws IOException {

    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

    String strSize, strGrades;

    int laki = 100;

    int totalGrades = 0;

    float gradeAverage = 0;

    float [] grades = new float [laki];
     System.out.print ("How many grades will you enter?");

    strSize = dataIn.readLine ();

    laki = Integer.parseInt (strSize);

    grades = new float [laki];

    for (int i = 0;

    i < laki; i ++) {

        System.out.print ("Please enter grade # " + (i + 1) + ": ");

        strGrades = dataIn.readLine ();

        grades [i] = Float.parseFloat (strGrades);

        totalGrades += grades [i];

    }

    gradeAverage = totalGrades / laki;

    System.out.println ("Your grades average is " + gradeAverage);

}
