public void doFilter (ServletRequest arg0, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    logger.info ("checking client id in filter");

    HttpServletRequest request = (HttpServletRequest) arg0;

    String clientId = request.getHeader ("clientId");

    if (StringUtils.isNotEmpty (clientId)){

        chain.doFilter (request, response);

    } else {

        logger.error ("client id missing.");

    }

}
