def list_files_for_folder(folder): 
     for file_entry in os.listdir(folder): 
         if os.path.isdir(file_entry): 
             list_files_for_folder(file_entry) 
         else: 
             print(file_entry)