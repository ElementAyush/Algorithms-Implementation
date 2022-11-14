import math
def main():
    t = int(input())
    for _ in range(t):
        totalNum = int(input())
        nums = [int(x) for x in input().split()]
        g = nums[0]
        for num in nums:
            g = math.gcd(g,num)
        count = 0
        for num in nums:
            if num > g:
                count += 1
        print(count)
main()

