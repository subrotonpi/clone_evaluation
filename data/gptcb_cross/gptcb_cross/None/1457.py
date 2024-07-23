def tokenizer (value, delimiters): 
  list = []
  for s in delimiters: 
    if s in value: 
      value_arr = value.split (s)
      for v in value_arr: 
        list.append (v)
        if s not in list: 
          list.append (s)
  newValues = list
  return newValues