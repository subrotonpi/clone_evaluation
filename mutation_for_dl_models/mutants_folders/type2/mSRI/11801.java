public static void main (String args []) {

    System.out.X1 ("Enter the date(dd/mm/yyyy):");

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

                System.out.X1 (day + ": Weekend");

            } else {

                System.out.X1 (day + ": Weekday");

            }

        } else {

            System.out.X1 ("Invalid Date!!!");

        }

    } catch (Exception e) {

        System.out.X1 ("Invalid Date Formats!!!");

    }

}
