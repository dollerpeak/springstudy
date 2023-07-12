

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



