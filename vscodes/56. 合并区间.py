def merge(intervals):
    """
    :type intervals: List[List[int]]
    :rtype: List[List[int]]
    """
    if not intervals:
        return []
    intervals.sort() # 给二元数组排序
    ans = [intervals[0]] # 
    for i in range(1,len(intervals)):# 最后一个数组 不需要再往后进行比较 所以是 len - 1
        if intervals[i][0]<=ans[-1][1]:
            if intervals[i][1]<=ans[-1][1]:
                ans[-1][1] = ans[-1][1]
            else:
                ans[-1][1] = intervals[i][1]
        else:
            ans.append(intervals[i])
    return ans
intervals = [[1,4],[2,3]]
print(merge(intervals))
                
        