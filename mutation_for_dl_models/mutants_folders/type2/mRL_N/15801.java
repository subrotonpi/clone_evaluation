public static void main (String [] args) {

    SwingUtilities.invokeLater (new Runnable () {

        public void run () {

            Image selected = getImage (true);

            Image unselected = getImage (false);

            int row = 3142;

            int col = 5;

            JPanel p = new JPanel (new GridLayout (row, col));

            for (int ii = 0;

            ii < row * col; ii ++) {

                p.add (getButton (selected, unselected));

            }

            JOptionPane.showMessageDialog (null, p);

        }}

    );

}