@Override

public void itemStateChanged (ItemEvent e) {

    if (e.getStateChange () == ItemEvent.SELECTED) {

        size = Integer.parseInt((String) box.getSelectedItem ());

        for (i = 1; i <= size; i ++) {

            System.out.print (" " + i);

        }

        System.out.println ();

    }

}
