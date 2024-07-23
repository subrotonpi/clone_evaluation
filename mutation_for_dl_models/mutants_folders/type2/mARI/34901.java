public void actionPerformed (ActionEvent e) {

    try {

        OutputStream os = new BufferedOutputStream (new FileOutputStream (file));

        XMLEncoder xe = new XMLEncoder (os);

        xe.setPersistenceDelegate (DefaultTableModel.class, new DefaultTableModelPersistenceDelegate ());

        xe.writeObject (model);

        xe.close ();

        X1 r = new BufferedReader (new InputStreamReader (new FileInputStream (file), "UTF-8"));

        textArea.read (r, null);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
