# -*- coding: utf-8 -*-
arr = [2, -1, 3, -8, 2, -1, 3, -11, 99, -7, 1]
last = -1<<31 # last应该初始化为int最小值
ans = 0
start = 0
end = 0
for i, num in enumerate(arr):
    # last = max(0, last) + arr[i]
    # ans = max(last, ans)
    if last > 0:
        last = last + arr[i]
    else:
        last = 0 + arr[i]
        start = i

    if last > ans:
        ans = last
        end = i
print(ans)
print(start, end)
