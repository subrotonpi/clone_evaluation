public ServletInputStream getInputStream () throws IOException {

    return new ServletInputStream () {

        ByteArrayInputStream bais = new X1 (body);

        @Override

        public int read () throws IOException {

            return bais.read ();

        }}

    ;

}
