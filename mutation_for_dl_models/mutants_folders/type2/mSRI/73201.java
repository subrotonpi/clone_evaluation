public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    HttpServletRequest req = (HttpServletRequest) request;

    if (req.getHeader ("x-dawson-nonce") == null || req.getHeader ("x-dawson-signature") == null) {

        X1 httpResponse = (X1) response;

        httpResponse.setContentType ("application/json");

        httpResponse.sendError (X1.SC_BAD_REQUEST, "Required headers not specified in the request");

        return;

    }

    chain.doFilter (request, response);

}
