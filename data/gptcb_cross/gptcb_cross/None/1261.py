def main():
    i = 0
    try:
        i = 10
        return i
    finally:
        i = 40
        print('local:{}'.format(i))

if __name__ == "__main__":
    main()