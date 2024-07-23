def main():
    n = int(input())
    a = [[int(x) for x in input().split()] for _ in range(n)]
    l_sum, r_sum = 0, 0
    for i in range(n):
        l_sum += a[i][i]
        r_sum += a[i][n-1-i]
    sum = l_sum + r_sum
    print(sum)

main()