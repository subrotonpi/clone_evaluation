def main():
    r = random.Random()
    dims = 1 + r.randint(3)
    sizes = [1 + r.randint(3) for _ in range(dims)]
    print("Creating array with dimensions / sizes: ", [str(x) for x in sizes])
    multi_dim_array = [['' for j in range(sizes[1])] for i in range(sizes[0])]
    fill_with_some_values(multi_dim_array, 'pos ', sizes)
    print(multi_dim_array)
def fill_with_some_values(multi_dim_array, prefix, sizes):
    if len(sizes) == 1:
        for i in range(sizes[0]):
            multi_dim_array[i] = prefix + str(i)
    else:
        for i in range(sizes[0]):
            fill_with_some_values(multi_dim_array[i], prefix +str(i), sizes[1:])

if __name__ == '__main__':
    main()