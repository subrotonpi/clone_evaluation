def main():
    ip1 = "127.0.0.1"
    inet1 = socket.gethostbyaddr(ip1)
    print ("Sending Ping Request to " + inet1[0])
    reply1 = socket.getpublicaddress(ip1)
    if reply1 == 0:
        print ("Host is NOT reachable")
    else:
        print ("Host is reachable")

    ip2 = "173.194.32.38"
    inet2 = socket.gethostbyaddr(ip2)
    print ("Sending Ping Request to " + inet2[0])
    reply2 = socket.getpublicaddress(ip2)
    if reply2 == 0:
        print ("Host is NOT reachable")
    else:
        print ("Host is reachable")

if __name__ == "__main__":
    main()