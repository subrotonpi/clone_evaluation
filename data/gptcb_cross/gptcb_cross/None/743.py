import sample
loader = CustomClassLoader()
try:
    c = loader.findClass("sample.Sample")
    o = c.newInstance()
except ClassNotFoundException as e:
    print(e)
except InstantiationException as e:
    print(e)
except IllegalAccessException as e:
    print(e)
