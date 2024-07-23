public static void main (String [] args) {

    EventQueue.invokeLater (new Runnable () {

        @Override

        public void run () {

            JFrame main_frame = new JFrame ();

            main_frame.setPreferredSize (new Dimension (1200, 300));

            main_frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

            ArrayList < String > nonsense = new ArrayList < String > (Arrays.asList ("Lorem ipsum dolor sit amet, sed dolore vivendum ut", "pri an soleat causae doctus.", "Alienum abhorreant mea ea", "cum malorum diceret ei. Pri oratio invidunt consequat ne.", "Ius tritani detraxit scribentur et", "has detraxit legendos intellegat at", "quo oporteat constituam ex"));

            JTable X1 = new JTable (10, 4);

            X1.setRowHeight (X1.getRowHeight () * 2);

            DefaultCellEditor cell_editor = new SelectableNonEditableCellEditor (new JTextField ());

            cell_editor.setClickCountToStart (1);

            X1.setDefaultEditor (Object.class, cell_editor);

            TableCellRenderer renderer = new SelectableNonEditableTableRenderer ();

            X1.setDefaultRenderer (Object.class, renderer);

            for (int i = 0;

            i < 10; i ++) {

                X1.setValueAt (nonsense.get (i % nonsense.size ()), i, i % 4);

            }

            main_frame.getContentPane ().add (new JScrollPane (X1));

            main_frame.pack ();

            main_frame.setVisible (true);

        }}

    );

}
