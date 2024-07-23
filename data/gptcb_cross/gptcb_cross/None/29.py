def delete_directory(directory):
  if os.path.exists(directory):
    for file in  os.listdir(directory):
      sub_dir = os.path.join(directory, file)
      if os.path.isdir(sub_dir):
        delete_directory(sub_dir)
      else:
        os.remove(sub_dir)
    os.removedirs(directory)
  
  return os.path.exists(directory)