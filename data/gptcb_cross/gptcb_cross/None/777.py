import gzip
data_to_compress = "This is the test data.".encode('ISO-8859-1')
with open('C:/Users/UserName/Desktop/zip_file.gz', 'wb') as file_stream: 
    with gzip.GzipFile(fileobj=file_stream) as zip_stream: 
        zip_stream.write(data_to_compress)
