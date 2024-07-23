def main():
  n, max, min = 0, float("-inf"), float("inf")
  print("Enter the number of elements: ")
  num_elements = int(input())
  arr = []
  print("Enter the elements: ")
  for i in range(num_elements):
    next_el = int(input())
    arr.append(next_el)
  
  for j in range(num_elements):
    if arr[j] > max:
      max = arr[j]
    elif arr[j] < min:
      min = arr[j]

  print("Highest Value in array: " + str(max))
  print("Smallest Value in array: " + str(min))

if __name__ == "__main__":
  main()