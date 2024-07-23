public static void main (String args []) {

    System.out.println ("ArtificialStringReplacement");

    Scanner scan = new Scanner (System.in);

    String Date = scan.nextLine ();

    try {

        boolean dateValid = dateValidate (Date);

        if (dateValid == true) {

            SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yy");

            java.util.Date date = df.parse (Date);

            df.applyPattern ("EEE");

            String day = df.format (date);

            if (day.compareTo ("Sat") == 0 || day.compareTo ("Sun") == 0) {

                System.out.println (day + ": Weekend");

            } else {

                System.out.println (day + ": Weekday");

            }

        } else {

            System.out.println ("Invalid Date!!!");

        }

    } catch (Exception e) {

        System.out.println ("Invalid Date Formats!!!");

    }

}
