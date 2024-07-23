public void actionPerformed (ActionEvent e) {

    try {

        OutputStream os = new BufferedOutputStream (new FileOutputStream (file));

        XMLEncoder xe = new XMLEncoder (os);


        xe.writeObject (model);

        xe.close ();

        Reader r = new BufferedReader (new InputStreamReader (new FileInputStream (file), "UTF-8"));

        textArea.read (r, null);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
