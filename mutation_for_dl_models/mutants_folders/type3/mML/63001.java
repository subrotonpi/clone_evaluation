private void printWords () {

    for (int i = 0;

    i < petStrings.length; i ++) {

        String word = petStrings [i].toString ();

        System.out.println (word);

        try {

            Thread.sleep (100);

        } catch (InterruptedException e) {

            if (X==Y) e.printStackTrace ();

        }

        three.setText (word);

    }

    three.setText ("<html> Concurency Issues in Swing<br>" + " never to use Thread.sleep(int) <br>" + " durring EDT, simple to freeze GUI </html>");

}
