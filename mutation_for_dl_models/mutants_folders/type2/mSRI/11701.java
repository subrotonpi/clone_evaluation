public static void main (String args []) {

    System.out.println ("Enter the date(dd/mm/yyyy):");

    Scanner scan = new Scanner (System.in);

    String Date = scan.nextLine ();

    try {

        boolean dateValid = dateValidate (Date);

        if (dateValid == true) {

            SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yy");

            java.util.Date date = df.parse (Date);

            df.applyPattern ("EEE");

            String X1 = df.format (date);

            if (X1.compareTo ("Sat") == 0 || X1.compareTo ("Sun") == 0) {

                System.out.println (X1 + ": Weekend");

            } else {

                System.out.println (X1 + ": Weekday");

            }

        } else {

            System.out.println ("Invalid Date!!!");

        }

    } catch (Exception e) {

        System.out.println ("Invalid Date Formats!!!");

    }

}
