def redix_sort(arr,pos):
  return 1



def main():
    arr = [1,208,16,20,99,2,3,8]
    exp = 1
    maxInarr = max(arr)
    while maxInarr/exp >= 1:
    	redix_sort(arr,exp)
    	exp *= 10

def test():
    arr = {}
    arr[1] = 26
    arr[1].append(20) 
    print(arr[1])


test()