def selection_sort(arr):
	arrLength = len(arr)

	for i in range(0, arrLength):
		minimum = i

		for j in range(i + 1 , arrLength):
			if arr[minimum] > arr[j]:
				minimum = j

		arr[i],arr[minimum] = arr[minimum],arr[i]


def main():
	arr = [1,2,8,6,7,3,2,9]
	print(arr)
	selection_sort(arr)
	print(arr)

main()

