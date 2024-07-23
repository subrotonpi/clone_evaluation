protected void layoutPlotChildren () {

    super.layoutPlotChildren ();

    for (Series < String, Number > series : getData ()) {

        for (Data < String, Number > data : series.getData ()) {

            StackPane bar = (StackPane) data.getNode ();

            X1 label = null;

            for (Node node : bar.getChildrenUnmodifiable ()) {

                LOGGER.debug ("Bar has child {}, {}.", node, node.getClass ());

                if (node instanceof X1) {

                    label = (X1) node;

                    break;

                }

            }

            if (label == null) {

                label = new X1 (series.getName ());

                label.setRotate (90.0);

                bar.getChildren ().add (label);

            } else {

                label.setText (series.getName ());

            }

        }

    }

}
