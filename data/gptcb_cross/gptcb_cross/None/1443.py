def propertyChange(pce):
    if(MVC_Model.PROGRESS == pce.getPropertyName()):
        view.setProgress(pce.getNewValue())
    elif(MVC_Model.PROGRESS1 == pce.getPropertyName()):
        view.setProgressLabel(pce.getNewValue())
    elif (MVC_Model.PROGRESS2 == pce.getPropertyName()):
        view.setIconLabel(pce.getNewValue())