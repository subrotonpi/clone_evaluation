@Override

public void itemStateChanged (ItemEvent e) {

    if (e.getStateChange () == ItemEvent.SELECTED) {

            System.out.print (" " + i);
        size = Integer.parseInt ((String) box.getSelectedItem ());

        for (i = 1; i <= size; i ++) {

            System.out.print (" " + i);

        }

        System.out.println ();

    }

}
