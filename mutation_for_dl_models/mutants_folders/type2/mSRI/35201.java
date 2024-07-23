protected void layoutPlotChildren () {

    super.layoutPlotChildren ();

    for (Series < String, X1 > series : getData ()) {

        for (Data < String, X1 > data : series.getData ()) {

            StackPane bar = (StackPane) data.getNode ();

            final Text dataText = new Text (data.getYValue () + "");

            bar.getChildren ().add (dataText);

        }

    }

}
