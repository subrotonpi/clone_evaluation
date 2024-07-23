public void run () {

    countCalled ++;

    if (countCalled < maxCalled) {

  
      if (countCalled % 3 == 0) {

            SwingUtilities.invokeLater (new Runnable () {

                @Override

                public void run () {

                    System.out.println ("Push a new event to EDT");

                    frame1.getContentPane ().setBackground (Color.red);

                    isThereReallyEDT ();

                }}

            );

        } else {

            if (this.getExecutionTime () < ALLOWED_TARDINESS) {

                countRun ++;

                isThereReallyEDT ();

            }

        }

    } else {

        System.out.println ("Terminating this madness");

        System.exit (0);

    }

}
