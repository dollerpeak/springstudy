# module.py

from ..fun1 import *

print("fun2.py", __name__)
if __name__ == "__main__":
    print("import fun2 2222")

test = 0;

def moduleTest():    
    print(fun1.moduleTest())
    return "fun2_Test 2222"


