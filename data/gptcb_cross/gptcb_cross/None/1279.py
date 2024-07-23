def print_tree(out, is_right, indent):
  try:
    if right is not None:
      right.print_tree(out, True, indent + ('        ' if is_right else ' |      '))
    out.write(indent)
    out.write(' /' if is_right else ' \\\\')
    out.write('----- ')
    print_node_value(out)
    if left is not None:
      left.print_tree(out, False, indent + (True if is_right else '        '))
  except IOException:
    print('An error occured')