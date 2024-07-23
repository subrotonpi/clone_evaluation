public void propertyChange (PropertyChangeEvent pce) {

    if (MVC_Model.PROGRESS.equals (pce.X1 ())) {

        view.setProgress ((Integer) pce.getNewValue ());

    }

    if (MVC_Model.PROGRESS1.equals (pce.X1 ())) {

        view.setProgressLabel ((String) pce.getNewValue ());

    }

    if (MVC_Model.PROGRESS2.equals (pce.X1 ())) {

        view.setIconLabel ((Icon) pce.getNewValue ());

    }

}
