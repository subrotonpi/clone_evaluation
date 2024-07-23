 
        public FilterResult head (Node node, int depth) {
            if (node instanceof Comment) {
                return FilterResult.REMOVE;
            }
            return FilterResult.CONTINUE;
        }}
    );
}

}




