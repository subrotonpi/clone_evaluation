def main(args):
    command = [args[0]]
    environ = os.environ
    process = subprocess.Popen(command, env=environ)
    
    for line in iter(process.stdout.readline, b''):
        print(line.decode('utf-8'))
    process.stdout.close()
    
    print("Program terminated!")