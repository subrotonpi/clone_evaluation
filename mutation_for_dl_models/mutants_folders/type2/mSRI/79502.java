public static double exp (double X1, int n) {

    return DoubleStream.iterate (1, new DoubleUnaryOperator () {

        private int i = 1;

        @Override

        public double applyAsDouble (double operand) {

            return operand * X1 / i ++;

        }}

    ).limit (n).sum ();

}
