# python 자료형

print(">>>>>>> 대표적인 자료형 <<<<<<<")
print("")

print(">> list ---------------------------------------------------------------")
print("데이터 type이 틀려도 관계없다.")
print("파이썬은 array는 없네")
print("> 생성")
print("list_vlues = list()")
print("list_data = [1,2,3]")
list_vlues = list()
list_data = [1, "2", 3.1]
print("type = ", type(list_vlues))
print("data = ", list_data)
print("> 사용")
print("")


print(">> tuple ---------------------------------------------------------------")
print("읽기용으로 데이터 업데이트, 삭제가 안됨")
print("데이터 type이 틀려도 관계없다.")
print("어디에서 쓸까?")
print("> 생성")
print("tuple_vlues = tuple()")
print("tuple_data = (1,2,3)")
tuple_vlues = tuple()
tuple_data = (1, "2", 3.1)
print("type = ", type(tuple_vlues))
print("data = ", tuple_data)
print("")

print(">> dictionary ---------------------------------------------------------------")
print("HashMap과 동일하고 생성시 set과 같은데 {} 데이터 형이 틀리니 구분이 가능하다")
print("key의 type이 틀려도 관계없다.")
print("> 생성")
print("dic_vlues = dict()")
print("dic_data = {1:1,2:2,3:3}")
dic_vlues = dict()
dic_data = {1: 1, "2": 2, 3: 3.1}
print("type = ", type(dic_vlues))
print("data = ", dic_data)
print("")

print(">> set ---------------------------------------------------------------")
print("집합의 개념으로 합집합, 차집합, 교집합 등이 가능")
print("> 생성")
print("set_vlues = set()")
print("dic_data = {1:1,2:2,3:3}")
set_vlues = set()
set_data = {1, 2, 3, 3}
print("type = ", type(set_vlues))
print("data = ", set_data)
print("")
