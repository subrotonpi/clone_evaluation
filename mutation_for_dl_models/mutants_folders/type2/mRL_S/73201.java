public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    HttpServletRequest req = (HttpServletRequest) request;

    if (req.getHeader ("x-dawson-nonce") == null || req.getHeader ("x-dawson-signature") == null) {

        HttpServletResponse httpResponse = (HttpServletResponse) response;

        httpResponse.setContentType ("application/json");

        httpResponse.sendError (HttpServletResponse.SC_BAD_REQUEST, "ArtificialStringReplacement");

        return;

    }

    chain.doFilter (request, response);

}
