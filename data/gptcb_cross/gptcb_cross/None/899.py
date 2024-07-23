def solution (number):
  binary = bin(number)[2:]
  gaps = binary.split('1')
  biggestGap = ''
  for i in range(0, len(gaps) - 1 if binary.endswith('1') else len(gaps)):
    if '0' in gaps[i] and len(gaps[i]) > len(biggestGap):
      biggestGap = gaps[i]
  return len(biggestGap)