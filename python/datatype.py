# python 자료형

# print(">>>>>>> integer <<<<<<<")
# print("엄청 큰 값도 가능")
# test_int = 9999999999999999999999999999999999
# print("test_int = ", test_int)
# print("")

# print(">>>>>>> float <<<<<<<")
# print("주로 내부함수 말고 공요함수 사용")
# test_float = 3.14159265358979
# print("test_float = ", test_float)
# print("자릿수 지정 = ", test_float.__round__(4))
# print("자릿수 지정 = ", round(test_float, 4))
# print("")

# print(">>>>>>> string <<<<<<<")
# print("캐릭터 타입의 리스트로 생각, 실제 캐릭터 자료형은 없음")
# test_str = "ab,cd,efg"
# print("test_str = ", test_str)
# print("test_str[0] = ", test_str[0])
# print("test_str[-1] = ", test_str[-1])
# print("slice, test_str[:] = ", test_str[:])
# print("slice, test_str[0:] = ", test_str[0:])
# print("slice, test_str[:10] = ", test_str[:10], "<== 인덱스를 넘어가도 에러가 나지 않고 출력")
# print("slice, test_str[::2] = ", test_str[::2], "<== 2칸씩 출력, 디폴트는 1")
# print("slice, test_str.split(',') = ", test_str.split(","), "<== 리턴값이 리스트")
# print("join은 split의 반대인데, 조금 헷갈림, 리스트에 있는 문자를 특정 문자로 연결한다고 생각")
# print("','.join(test_str.split(','))", "-".join(test_str.split(",")))
# test_str1 = """1234
# abcd"""
# print("문자열 표시를 3개 사용해서 \\n 효과를 그대로 사용\n", test_str1)
# test_str2 = "1234abcd!@#$1234abcd!@#$"
# print("len(test_str) = ", len(test_str2))
# print("test_str2.startswith('123')", test_str2.startswith("123"))
# print("test_str2.endswith('123')", test_str2.endswith("123"))
# print("test_str2.find('abc')", test_str2.find("abc"), "<== 오프셋을 리턴")
# print("test_str2.rfind('abc')", test_str2.rfind("abc"), "<== 오프셋을 리턴")
# print("test_str2.count('abc')", test_str2.count("abc"))
# print("그외 기타등등.. 아주 많음, 필요할때 찾아서 사용")
# print("")

# print(">>>>>>> 형변환 <<<<<<<")
# test_int = 999
# test_float = 99.999
# test_str = "999"
# print("type(test_int) = ", type(test_int), "<== 자료형별 타입")
# print("type(test_float) = ", type(test_float), "<== 자료형별 타입")
# print("type(test_str) = ", type(test_str), "<== 자료형별 타입")
# print("type(str(test_int)) = ", type(str(test_int)), "<== int를 str로 변형")
# print("type(str(test_float)) = ", type(str(test_float)), "<== float를 str로 변형")
# print("type(int(test_str)) = ", type(int(test_str)), "<== str를 int로 변형")
# print("type(float(test_str)) = ", type(float(test_str)), "<== str를 float로 변형")
# print("float(test_str) = ", float(test_str), "<== str를 float로 변형, 소수점은 한자리만 적용되네")
# print("")


print(">>>>>>> list <<<<<<<")
test_list1 = list()
test_list2 = []
print("생성, test_list = list() / test_list = []")
test_list3 = list('abcd')
print("생성 및 초기화, test_list3 = list('abcd')")
print("test_list3 = ", test_list3)
print("test_list3[1] = ", test_list3[1])
print("test_list3[-1] = ", test_list3[-1], "<== 문자열과 동일")
print("test_list3[1:2] = ", test_list3[1:3], "<== 문자열과 동일, 다만 리턴값이 리스트")
test_list1.append("1")
print("test_list1 = ", test_list1, "<== append는 리스트 끝에 추가")
test_list1.append("2")
print("test_list1 = ", test_list1, "<== append는 리스트 끝에 추가")
test_list1.insert(1, "3")
print("test_list1 = ", test_list1, "<== insert는 인덱스로 추가")
del test_list1[1]
print("test_list1 = ", test_list1, "<== del 인덱스로 삭제")
test_list1.remove("2")
print("test_list1 = ", test_list1, "<== remove 값으로 삭제")



# print(">> list ---------------------------------------------------------------")
# print("데이터 type이 틀려도 관계없다.")
# print("파이썬은 array는 없네")
# print("> 생성")
# print("list_vlues = list()")
# print("list_data = [1,2,3]")
# list_vlues = list()
# list_data = [1, "2", 3.1]
# print("type = ", type(list_vlues))
# print("data = ", list_data)
# print("> 사용")
# print("")


# print(">> tuple ---------------------------------------------------------------")
# print("읽기용으로 데이터 업데이트, 삭제가 안됨")
# print("데이터 type이 틀려도 관계없다.")
# print("어디에서 쓸까?")
# print("> 생성")
# print("tuple_vlues = tuple()")
# print("tuple_data = (1,2,3)")
# tuple_vlues = tuple()
# tuple_data = (1, "2", 3.1)
# print("type = ", type(tuple_vlues))
# print("data = ", tuple_data)
# print("")

# print(">> dictionary ---------------------------------------------------------------")
# print("HashMap과 동일하고 생성시 set과 같은데 {} 데이터 형이 틀리니 구분이 가능하다")
# print("key의 type이 틀려도 관계없다.")
# print("> 생성")
# print("dic_vlues = dict()")
# print("dic_data = {1:1,2:2,3:3}")
# dic_vlues = dict()
# dic_data = {1: 1, "2": 2, 3: 3.1}
# print("type = ", type(dic_vlues))
# print("data = ", dic_data)
# print("")

# print(">> set ---------------------------------------------------------------")
# print("집합의 개념으로 합집합, 차집합, 교집합 등이 가능")
# print("> 생성")
# print("set_vlues = set()")
# print("dic_data = {1:1,2:2,3:3}")
# set_vlues = set()
# set_data = {1, 2, 3, 3}
# print("type = ", type(set_vlues))
# print("data = ", set_data)
# print("")

