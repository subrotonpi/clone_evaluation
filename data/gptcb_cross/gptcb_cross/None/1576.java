 
        public void changed (ObservableValue < ? extends Worker.State > observableValue, Worker.State state, Worker.State newState) {
            if (newState.equals (Worker.State.SUCCEEDED)) {
                dialog.show ();
                dialog.toFront ();
            }
        }}
    );





