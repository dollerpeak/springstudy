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

a = {1: '1', 2: 2, 3: 3}
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
