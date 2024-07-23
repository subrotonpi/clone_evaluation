public void actionPerformed (ActionEvent e) {

    try {

        OutputStream os = new BufferedOutputStream (new FileOutputStream (file));

        XMLEncoder X1 = new XMLEncoder (os);

        X1.setPersistenceDelegate (DefaultTableModel.class, new DefaultTableModelPersistenceDelegate ());

        X1.writeObject (model);

        X1.close ();

        Reader r = new BufferedReader (new InputStreamReader (new FileInputStream (file), "UTF-8"));

        textArea.read (r, null);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
