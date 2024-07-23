public void actionPerformed (ActionEvent e) {

    try {

        InputStream is = new BufferedInputStream ();

        XMLDecoder xd = new XMLDecoder (is);

        model = (DefaultTableModel) xd.readObject ();

        table.setModel (model);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
