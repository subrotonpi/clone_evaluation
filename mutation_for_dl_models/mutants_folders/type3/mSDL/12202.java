private void removeComments (Element article) {

    article.filter () {

        @Override

        public FilterResult tail (Node node, int depth) {

            if (node instanceof Comment) {

                return FilterResult.REMOVE;

            }

            return FilterResult.CONTINUE;

        }@Override

        public FilterResult head (Node node, int depth) {

            if (node instanceof Comment) {

                return FilterResult.REMOVE;

            }

            return FilterResult.CONTINUE;

        }}

    );

}
