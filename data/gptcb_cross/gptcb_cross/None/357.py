def main():
    v1 = [1, -10, 3, 9, 7, 99, -25]
    v2 = [1, -10, 3, 9, 7, 99, -25]
    p_int = ArrayMath.scalar_product(v1, v2)
    v1_d = [1.1, -10.5, 3.7, 9.98, 7.4, 9.9, -2.5]
    v2_d = [1.1, -10.5, 3.7, 9.98, 7.4, 9.9, -2.5]
    p_double = ArrayMath.scalar_product(v1_d, v2_d)
    print("p_int: ", p_int)
    print("p_double: ", p_double)

if __name__ == '__main__':
    main()