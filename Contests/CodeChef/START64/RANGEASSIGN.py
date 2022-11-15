def main():
    t = int(input())
    for _ in range(t):
        numLen = int(input())
        nums = [int(x) for x in input().split()]
        isPresent = False
        if nums[0] == nums[numLen - 1]:
            isPresent = True
        else:
            for i in range(numLen - 1):
                if nums[0] == nums[i] and nums[i + 1] == nums[-1]:
                    isPresent = True
        if isPresent:
            print("YES")
        else:
            print("NO")

            
main()
