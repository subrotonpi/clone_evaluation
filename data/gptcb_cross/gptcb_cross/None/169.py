def main():
    exit_command = 'exit' 
    while True:
        input_text = input('><![CDATA[ ')
        print(input_text)
        if input_text.lower() == exit_command:
            print('Exiting.')
            return
        else:
            print('...response goes here...')

main()