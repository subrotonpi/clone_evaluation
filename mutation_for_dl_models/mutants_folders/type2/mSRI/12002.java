public void onCreate (Bundle savedInstanceState) {

    super.onCreate (savedInstanceState);

    tv = new TextView (this);

    this.setContentView (tv);

    SimpleDateFormat X1 = new SimpleDateFormat ("dd.MM.yyyy, HH:mm");

    String oldTime = "19.02.2018, 12:00";

    String NewTime = "20.02.2018, 14:00";

    Date oldDate, newDate;

    try {

        oldDate = X1.parse (oldTime);

        newDate = X1.parse (NewTime);

        oldLong = oldDate.getTime ();

        NewLong = newDate.getTime ();

        diff = NewLong - oldLong;

    } catch (ParseException e) {

        e.printStackTrace ();

    }

    MyCount counter = new MyCount (diff, 1000);

    counter.start ();

}
