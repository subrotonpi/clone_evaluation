private void printWords () {

    for (int i = 0;

    i < petStrings.length; i ++) {

        String word = petStrings [i].toString ();

        System.out.println (word);

        try {

            Thread.sleep (100);

        } catch (InterruptedException e) {

            e.printStackTrace ();

        }

        three.setText (word);

    }


}
