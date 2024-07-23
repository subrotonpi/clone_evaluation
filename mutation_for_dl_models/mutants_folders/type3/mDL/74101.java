public static void main (String [] args) {

    String [] columnNames = {"Item", "Description"};

    Object [] [] data = {{"Item 1", "Description of Item 1"}, {"Item 2", "Description of Item 2"}, {"Item 3", "Description of Item 3"}};

    JTable table = new JTable (data, columnNames);

    table.getColumnModel ().getColumn (1).setPreferredWidth (300);

    table.setPreferredScrollableViewportSize (table.getPreferredSize ());

    JScrollPane scrollPane = new JScrollPane (table);

    TablePopupEditor popupEditor = new TablePopupEditor ();

    table.getColumnModel ().getColumn (1).setCellEditor (popupEditor);

    JFrame frame = new JFrame ("Popup Editor Test");

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    frame.add (new JTextField (), BorderLayout.NORTH);

    frame.add (scrollPane);

    frame.pack ();

    frame.setLocationRelativeTo (null);


}
