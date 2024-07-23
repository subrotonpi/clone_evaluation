public void doFilter (ServletRequest arg0, ServletResponse X1, FilterChain chain) throws IOException, ServletException {

    logger.info ("checking client id in filter");

    HttpServletRequest request = (HttpServletRequest) arg0;

    String clientId = request.getHeader ("clientId");

    if (StringUtils.isNotEmpty (clientId)) {

        chain.doFilter (request, X1);

    } else {

        logger.error ("client id missing.");

    }

}
