public ServletInputStream getInputStream () throws IOException {

    return new ServletInputStream (X1) {

        ByteArrayInputStream bais = new ByteArrayInputStream (body);

        @Override

        public int read () throws IOException {

            return bais.read ();

        }}

    ;

}
