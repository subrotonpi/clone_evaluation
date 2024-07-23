public static void main (String [] args) throws InterruptedException {

    String [] arrayElements = {"value1", "value2", "value3", "value4"};

    long start = System.currentTimeMillis ();

    for (int i = 0;

    i < arrayElements.length; i ++) {

        final String value = arrayElements [i];

        new java.util.Timer ().schedule (new java.util.TimerTask () {

            public void run () {

                System.out.println (value);

            }}

        , new Date (start));

        start += 5000;

    }

}