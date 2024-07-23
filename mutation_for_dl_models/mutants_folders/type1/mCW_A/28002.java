public ServletInputStream getInputStream () throws IOException {

    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (body.getBytes ());

    ServletInputStream inputStream = new ServletInputStream () {

        public int read () throws IOException {

            return byteArrayInputStream.read ();

        }}

    ; 

    return inputStream;

}
