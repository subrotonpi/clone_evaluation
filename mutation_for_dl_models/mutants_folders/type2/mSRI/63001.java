private void printWords () {

    for (int i = 0;

    i < petStrings.length; i ++) {

        String X1 = petStrings [i].toString ();

        System.out.println (X1);

        try {

            Thread.sleep (100);

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

        three.setText (X1);

    }

    three.setText ("<html> Concurency Issues in Swing<br>" + " never to use Thread.sleep(int) <br>" + " durring EDT, simple to freeze GUI </html>");

}
