public ServletInputStream getInputStream () throws IOException {

    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream ();

    ServletInputStream inputStream = new ServletInputStream () {

        public int read () throws IOException {

            return byteArrayInputStream.read ();

        }}

    ;

    return inputStream;

}
