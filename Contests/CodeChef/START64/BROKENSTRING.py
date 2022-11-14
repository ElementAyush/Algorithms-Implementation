def main():
    t = int(input())
    for _ in range(t):
        strLen = int(int(input())/2)
        str = input()
        isTrue = True
        for i in range(0,strLen):
            if str[i] != str[i + strLen]:
                isTrue = False
                break
                
        if isTrue:
         print("YES")
        else:
         print("NO")

main()
