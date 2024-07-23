import jsch
jsch = jsch.JSch ()
session = None
try: 
    session = jsch.getSession ("username", "127.0.0.1", 22)
    session.setConfig ("StrictHostKeyChecking", "no")
    session.setPassword ("password")
    session.connect ()
    channel = session.openChannel ("sftp")
    channel.connect ()
    sftpChannel = channel.ChannelSftp ()
    sftpChannel.get ("remotefile.txt", "localfile.txt")
    sftpChannel.exit ()
    session.disconnect ()
except jsch.JSchException as e:
    e.printStackTrace ()
except jsch.SftpException as e:
    e.printStackTrace ()
