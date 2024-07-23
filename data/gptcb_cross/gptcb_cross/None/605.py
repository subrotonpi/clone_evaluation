import socket
try:
    host = socket.gethostbyname("192.168.1.103")
    s = socket.create_connection((host, 80), 10)
    print("Is host reachable? " + s.recv(2048).decode("utf-8"))
except:
    print("Host not reachable")
