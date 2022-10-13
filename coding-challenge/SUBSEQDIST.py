from collection import Counter

t = int(input())

while t > 0:
	n = int(input())
	arr = list(map(int,input().split()))
	countArray = Counter(arr)
	maxFrequency = 0
	for x in countArray:
		if x > maxFrequency:
			maxFrequency = x
	t -=1