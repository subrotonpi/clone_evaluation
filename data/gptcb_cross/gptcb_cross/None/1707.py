def main():
    ssh = Session()
    ssh.load_known_hosts()
    ssh.connect('localhost')
    try:
        ssh.userauth_publickey_fromfile(os.environ['username'])
        src = f"{os.environ['user.home']}/test_file"
        sftp = ssh.sftp_init()
        try:
            file = File(sftp, src)
            file.send('/tmp')
        except Exception as e:
            print('Error:', e)
        finally:
            sftp.close()
    finally:
        ssh.disconnect()

if __name__ == '__main__':
    main()