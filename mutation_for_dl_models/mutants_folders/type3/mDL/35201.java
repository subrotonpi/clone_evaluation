protected void layoutPlotChildren () {

    super.layoutPlotChildren ();

    for (Series < String, Number > series : getData ()) {

        for (Data < String, Number > data : series.getData ()) {


            final Text dataText = new Text (data.getYValue () + "");

            bar.getChildren ().add (dataText);

        }

    }

}
