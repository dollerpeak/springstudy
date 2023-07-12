# import sys
# sys.path.append("./util")


print("test")

a = 1
b = 1.234
print(type(a))
print(type(b))
print("--------------------------------------")

a = 5
b = 2
print(a / b)
print(a // b)
print(a % b)
print("--------------------------------------")

a = "python's is simple"
print(a)
print("--------------------------------------")

a = "123456789"
print("string slice = ", a[:4])
print("string slice = ", a[1:4])
print("string slice = ", a[7:])
print("string slice = ", a[::2])
print("string slice = ", a[::-1])
print("string slice = ", a[::-2])
print("--------------------------------------")

a = "i eat %dcnt apple" % 3
print("print = ", a)
print("type = ", type(a))
print("count = ", a.count("a"))
print("find = ", a.find("eat"))
print("type = ", type(a.find("a")))
print("find = ", a.find("a"))
print("index = ", a.index("a"))
print("--------------------------------------")

a = ",".join("abcd")
print("join = ", a)
print("type = ", type(a))

a = ",".join(["a", "b", "c", "d"])
print("join = ", a)
print("type = ", type(a))

a = ["a", "b", "c", "d"]
print("list = ", a)
print("type = ", type(a))

a = "a:b:c:d"
b = a.split(":")
print("split = ", b)
print("type = ", type(b))
print("b[0] = ", b[0])
print("--------------------------------------")

a = ["1", "2", "3", "4"]
print("type = ", type(a))
# a = {"1", "2", "3", "4"}
# a.append(4)
# a.clear()
# a.insert(1, 1);
# b = a.remove("0")
# print("b = ", type(b))
# print("a = ", a)
del a[0]
print("a = ", a)
print("--------------------------------------")

a = {1: "1", 2: 2, 3: 3}
print("type = ", type(a))
b = a.keys()
print("key = ", b)
print("type = ", type(b))
b = a.values()
print("values = ", b)
print("type = ", type(b))
b = a.items()
print("items = ", b)
print("type = ", type(b))
for k, v in a.items():
    print("key = ", k, ", type = ", type(k))
    print("values = ", v, ", type = ", type(v))
print("get = ", a.get(1), ", type = ", type(a.get(9)))
print("--------------------------------------")

a = {1, 2, 3, 4, 5}
b = {5, 6, 7, 8, 9}
print("type = ", a)
print("type = ", type(a))
print("type = ", a.intersection(b))
print("type = ", a.union(b))
print("type = ", a.difference(b))
a.add(6)
print("type = ", a)
a.update([6, 7, 8])
print("type = ", a)
print("--------------------------------------")

a = [1, 2, 3]
b = a.copy()
b[0] = 0
print("a = ", a)
print("b = ", b)
print("--------------------------------------")

if True & True:
    pass
else:
    print("bbbb")
print("--------------------------------------")

a = 1
a += 1
print("a = ", a)
print("--------------------------------------")

a = "string"
for s in a:
    print("str = ", s)
print("--------------------------------------")


def sum(a=0, b=0):
    return a + b


print("sum = ", sum(1))

a = (1, 2, 3)
print("tuple = ", type(a))


def sum(a=0, b=0, c=0):
    return a + b + c, 0


print("sum return type = ", type(sum(1)))


print("--------------------------------------")

a = [1, 2, 3]
print("a = ", a.pop())
print("a = ", a)
print("--------------------------------------")

for i in range(5):
    print(i, end=" ")
print()
print("--------------------------------------")

# a = input("값입력:")
a = open("./111.txt", "w", encoding="UTF-8")  # w, r, a
for i in range(10):
    data = "%d 번째 라인\n" % i
    a.write(data)
a.close()

a = open("./111.txt", "r", encoding="UTF-8")  # w, r, a
for i in range(10):
    line = a.readline()
    # print(line)
    print(line.strip("\n"))
a.close()
print("-----------------------------------")


class Calculator:
    def __init__(self):
        self.result = 0

    def add(self, num):
        self.result += num
        return self.result


a = Calculator()
print("a = ", a)
print("type = ", type(a))
print("a = ", a.result)
print("add = ", a.add(1))


class Calculator1:
    result = 0

    def __init__(self):
        pass

    def add(self, num):
        Calculator1.result += num
        return Calculator1.result


a = Calculator1()
print("a = ", a)
print("type = ", type(a))
print("a = ", a.result)
print("add = ", a.add(1))
print("-----------------------------------")


class Test:
    count = 0

    def __init__(self, w, h):
        self.w = w
        self.h = h
        Test.count += 1

    def add(self):
        return self.w + self.h

    def __str__(self):
        print(Test.count, self.w, self.h)
        pass


a = Test(1, 2)
print("add111 = ", a.add())
a.w = 2
print("add222 = ", a.add())
print("count = ", a.count)

a.count = 10
print("count 111 = ", a.count)
print("count 111 = ", Test.count)

Test.count = 5
print("count 222 = ", a.count)
print("count 222 = ", Test.count)
a.__str__()


from util.fun1 import *
from util.fun2 import *

print(fun1.moduleTest())
print(fun2.moduleTest())

# a = module
# print("a = ", a.moduleTest())
# print("a = ", a.test)
# a.test = 10

# b = module
# print("b = ", b.moduleTest())
# print("a = ", b.test)

try:
    a = 0
    a = a / 0
except Exception as e:
    print(e)
finally:
    pass

# import webbrowser
# webbrowser.open("www.naver.com")

import sys
print(sys.path)


"""
asdfasdf
"""

print()
print()
print("표현식 -----------------------------------")
print("표현식 -----------------------------------")
print("표현식 -----------------------------------")
print("list [], array는 없는건가?")
print("tuple (), 값을 변경할 수 없음, 생성/초기화 가능")
print("dictionary {}, map이랑 동일하고")
print("set {}, 집합")
print("--------------------------------------")
