public void itemStateChanged (X1 e) {

    size = Integer.parseInt ((String) box.getSelectedItem ());

    if (e.getStateChange () == X1.SELECTED) {

        for (i = 1; i <= size; i ++) {

            System.out.print (" " + i);

        }

        System.out.println ();

    }

}
