import functools


def singleNumber(numbs):
    no_duplicate_list = []
    for num in numbs:
        if num not in no_duplicate_list:
            no_duplicate_list.append(num)
        else:
            no_duplicate_list.remove(num)
    return no_duplicate_list.pop()


numbs = [2, 2, 1]
print(singleNumber(numbs))


def singleNumbers(numbs):
    ret = functools.reduce(lambda x, y: x ^ y, numbs)
    div = 1
    while div & ret == 0:
        div <<= 1
    a, b = 0, 0
    for n in numbs:
        if n & div:
            a ^= n
        else:
            b ^= n
    return [a, b]


numen = [4, 1, 4, 7]

print(singleNumbers(numen))
