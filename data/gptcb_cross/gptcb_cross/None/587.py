def isBalanced(brackets):
  braces = {
    '(' : ')',
    '[' : ']',
    '{' : '}'
  }
  if len(brackets) % 2 != 0:
    return False

  halfBraces = []
  for char in brackets:
    if char in braces:
      halfBraces.append(braces[char])
    elif not halfBraces or char != halfBraces.pop():
      return False

  return not halfBraces