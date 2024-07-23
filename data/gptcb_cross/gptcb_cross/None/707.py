def check_zero(to_check):
    numerics = [int, float, long, short, byte, int, float, long, short, byte] 
    try:
        fields = to_check.__class__.__dict__.items()
        for field, value in fields:
            if type(value) in numerics:
                if value == 0:
                    return True
    except Exception as e:
        e.print_stack_trace()
    return False