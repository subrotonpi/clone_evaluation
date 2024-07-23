def test_method_call(object,loops):
    for _ in range(loops):
        s = object.getClass()
regular_calls = time.time_ns() - start
import inspect
method_ = inspect.getmembers(object, predicate=inspect.ismethod)
start = time.time_ns()
def test_invoke(object,loops,method):
    for _ in range(loops):
        s = method(object)
reflective_calls = time.time_ns() - start
start = time.time_ns()
def test_get_method_invoke(object,loops,method_):
    for _ in range(loops):
        for m in method_:
            s = m[1](object)
reflective_lookup = time.time_ns() - start
print("Average regular method calls:", regular_calls/loops, "ns.") 
print("Average reflective method calls without lookup:", reflective_calls/loops,  "ns.") 
print("Average reflective method calls with lookup:", reflective_lookup/loops, "ns.")