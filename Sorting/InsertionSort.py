def insertion_sort(arr):

	arrLength = len(arr)

	for i in range(1, arrLength):
		currElement = arr[i]
		j = i - 1

		while j >= 0 and currElement < arr[j]:
			arr[j + 1] = arr[j]
			j-=1
		arr[j + 1] = currElement

def main():
	arr = [1,6,2,4,4,8,7,3,9]
	print(arr)
	insertion_sort(arr)
	print(arr)

main()