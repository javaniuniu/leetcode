import heapq
# 排序
def getLeastNumbers(arr,k):
    for i in range(len(arr)-1): 
        if arr[i]> arr[i+1]:
            sort(arr,i)
        for j in range(i,0,-1):
            if arr[j] < arr[j-1]:
                lowsort(arr,j)
#             
    return arr[:k]
        
        
def sort(arr,i):
    temp = arr[i]
    arr[i] = arr[i+1]
    arr[i+1] = temp
    return arr

def lowsort(arr,j):
    temp = arr[j]
    arr[j] = arr[j-1]
    arr[j-1] = temp
    return arr

    
# arr = [3,2,1,4]
# k = 2
# print(getLeastNumbers(arr,k))


def getLeastNumberers(arr,k):
    if k == 0:
        return list()

    hp = [-x for x in arr[:k]]
    heapq.heapify(hp)
    for i in range(k, len(arr)):
        if -hp[0] > arr[i]:
            heapq.heappop(hp)
            heapq.heappush(hp, -arr[i])
    ans = [-x for x in hp]
    return ans


arr = [4,3,5,3,1]
k = 3
print(getLeastNumberers(arr,k))