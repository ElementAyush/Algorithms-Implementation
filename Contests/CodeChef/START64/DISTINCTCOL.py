def main():
    t = int(input())
    for _ in range(t):
        totalColors = int(input())
        colors = [int(x) for x in input().split()]
        maxCountColor = max(colors)
        print(maxCountColor)
main()