public void actionPerformed (ActionEvent e) {

    try {

        InputStream is = new BufferedInputStream (new FileInputStream (file));

        XMLDecoder xd = new XMLDecoder (is);

        model = (DefaultTableModel) xd.readObject ();


    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
