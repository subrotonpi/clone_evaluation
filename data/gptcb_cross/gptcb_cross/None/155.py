def add (view): 
    first = findViewById (R.id.first) 
    second = findViewById (R.id.second) 
    result = findViewById (R.id.result) 
    if first.getText () is None: 
        first.setError ("This field can't be empty") 
    elif second.getText () is None: 
        second.setError ("This field can't be empty") 
    else: 
        s = float (second.getText ()) 
        f = float (first.getText ()) 
        r = f + s 
        result.setText (str (r))