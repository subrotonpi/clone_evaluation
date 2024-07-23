import pysftp
with pysftp.Connection('127.0.0.1', username='username', password='password') as sftp:
    sftp.get('remotefile.txt', 'localfile.txt')
