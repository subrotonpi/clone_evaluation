public void propertyChange (PropertyChangeEvent pce) {

    if (MVC_Model.PROGRESS.equals (pce.getPropertyName ())) {

        view.setProgress ((Integer) pce.getNewValue ());

    }

    if (MVC_Model.PROGRESS1.equals (pce.getPropertyName ())) {

        view.setProgressLabel ((String) pce.getNewValue ());

    }

    if (MVC_Model.PROGRESS2.equals (pce.getPropertyName ())) {

        view.setIconLabel ((Icon) pce.getNewValue ());
 
    }

}
