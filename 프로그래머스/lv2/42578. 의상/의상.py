from collections import Counter
from functools import reduce

def solution(clothes):   
    cnt = Counter(types for name, types in clothes)

    return reduce(lambda x, y: x * (y + 1), cnt.values(), 1) - 1