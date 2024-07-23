def main(args):
   localhost = socket.gethostbyname('127.0.0.1')
   print("Sending Ping Request to", localhost)
   is_reachable = socket.getfqdn(localhost)
   if is_reachable:
       print('Host is reachable')
   else:
       print('Host is NOT reachable')
   google = socket.gethostbyname('173.194.32.38')
   print("Sending Ping Request to", google)
   is_reachable = socket.getfqdn(google)
   if is_reachable:
       print('Host is reachable')
   else:
       print('Host is NOT reachable')

if __name__ == "__main__":
   main(args)