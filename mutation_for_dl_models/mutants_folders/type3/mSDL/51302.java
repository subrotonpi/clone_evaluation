public void itemStateChanged (ItemEvent e) {

    size = Integer.parseInt ();

    if (e.getStateChange () == ItemEvent.SELECTED) {

        for (i = 1; i <= size; i ++) {

            System.out.print (" " + i);

        }

        System.out.println ();

    }

}