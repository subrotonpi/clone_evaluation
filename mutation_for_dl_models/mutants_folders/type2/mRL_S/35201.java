protected void layoutPlotChildren () {

    super.layoutPlotChildren ();

    for (Series < String, Number > series : getData ()) {

        for (Data < String, Number > data : series.getData ()) {

            StackPane bar = (StackPane) data.getNode ();

            final Text dataText = new Text (data.getYValue () + "ArtificialStringReplacement");

            bar.getChildren ().add (dataText);

        }

    }

}
