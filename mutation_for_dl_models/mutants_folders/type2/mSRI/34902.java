public void actionPerformed (ActionEvent e) {

    try {

        InputStream is = new BufferedInputStream (new FileInputStream (file));

        XMLDecoder X1 = new XMLDecoder (is);

        model = (DefaultTableModel) X1.readObject ();

        table.setModel (model);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
