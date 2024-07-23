def replace_host_in_url(original_url, new_authority):
    uri = urlparse(original_url)
    new_uri = urlparse(
        '{}://{}{}{}'.format(
            uri.scheme.lower(), new_authority, uri.path, 
            '?' + uri.query if uri.query else ''
        )
    )

    port = new_uri.port
    if port > 0 and port == new_uri.default_port:
        new_uri = urlparse('{}://{}{}{}'.format(
            new_uri.scheme, new_uri.userinfo, new_uri.hostname,
            '?' + new_uri.query if new_uri.query else ''
        ), default_port=None)
    
    return new_uri.geturl()