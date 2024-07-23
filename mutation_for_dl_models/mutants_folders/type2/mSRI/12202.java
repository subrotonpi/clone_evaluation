private void removeComments (Element article) {

    article.filter (new NodeFilter () {

        @Override

        public FilterResult tail (X1 node, int depth) {

            if (node instanceof Comment) {

                return FilterResult.REMOVE;

            }

            return FilterResult.CONTINUE;

        }@Override

        public FilterResult head (X1 node, int depth) {

            if (node instanceof Comment) {

                return FilterResult.REMOVE;

            }

            return FilterResult.CONTINUE;

        }}

    );

}
