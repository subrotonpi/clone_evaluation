 
        public void run () {
            fileChooser.setSelectedFile (new File (file));
            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            fireEditingStopped ();
        }}
    );




