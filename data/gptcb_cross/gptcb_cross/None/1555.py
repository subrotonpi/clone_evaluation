data = {"foo": ["1", "2", "3"],
        "bar": ["3", "2"], 
        "baz": ["5", "6", "7"]}
foo = Foo(data)
for combination in foo.allUniqueCombinations():
    print(combination)
