class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = [] # 数据栈
        self.helper = [] # 辅助栈


    def push(self, x: int) -> None:
        self.stack.append(x)
        if not self.helper or self.helper[-1] >= x:
            self.helper.append(x)
        else:
            self.helper.append(self.helper[-1])


    def pop(self) -> None:
        if self.stack:
            self.helper.pop()
            return self.stack.pop()


    def top(self) -> int:
        if self.stack:
            return self.stack[-1]


    def getMin(self) -> int:
        if self.helper:
            return self.helper[-1]



# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()