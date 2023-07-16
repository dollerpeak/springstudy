"""
Copyright : YYYY company
Create on YYYY.MM.DD
@author : name
"""

# 파일 로드
# import sample.image.render as render
# render.test_1();

# 함수 로드
# from src.image.render import test_1, test_2
# print("함수 import =");
# test_2();

import sample.image.render as render
import sample.sound.play as soundPlay
import sample.sound.stop as soundStop



print("__init__은 디렉토리에 있는 모든 py파일(패키지)을 import할때 미리 __all___정의해 둘수 있다.")
print("근데 * 이거 쓰기는 좀 그러니깐 그냥 개별적으로 py파일(모듈)을 import하자.")
render.test_1()
soundPlay.test_1()
soundStop.test_1()


if __name__ == "__main__":
    # print("main으로 실행")
    pass
else:
    # print("모듈로 실행")
    pass
