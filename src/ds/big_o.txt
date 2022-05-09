package main

import "fmt"

/*
	Topic: Big O
	Created at: 21/12/2020 by @nodirshox

	We need to care about our algorithm complexity.
	We use Big O notation for metrics.
	What is Big O?

	Big O - Upper bound. It is worst case. It could be O(n), O(n^2), O(logn), ...
	Big Omega - Lower bound. It is best case. Maybe O(1).
	Big Theta - Medium bound. It can be average case.

	But, in industry, most focuses on Big O and Big Theta.

	Until now, we talked about time complexity. But we also take care of
	Memory or space complexity. This means how much memory takes your algorithm in runtime.
	If we need to create array of size n. This means it required O(n) space.
	If you want to create two dimensional array, this will required O(n^2) space
	Stack recursive call counts too. Sample function algorithm below takes O(n) time and O(n) space.
	From: Cracking the Coding Interview. 6th edition.

	We should count only dominant terms and drop rest of them
	O(N^2 + N) => O(N^2)
	O(N + logN) => O(N)
	O(5*2^N + 100*N^100) => O(2^N)

	But, we have a 2 expression O(B^2 + A) can't be reduced without have a knowledge of A and B

	========
	O(log N)

	We often see O(log N). What does it mean?
	Let's look at by explaning a binary search tree.
	We have sorted N elements in array. And we are look some specific X number:
	Sear for: 9
	In: { 1, 5, 8, 9, 11, 13, 15, 19, 21 }
	First we compare 9 with middle point which is 11. If both are equal return this.
	If x < middle, search again with left side. x > middle, search again with right hand side.
	search 9 within { 1, 5, 8, 9, 11, 13, 15, 19, 21 }
		compare 9 with 11 -> smaller:
			search 9 within { 1, 5, 8, 9, 11 }
				compare 9 with 8 -> bigger:
					search 9 within { 9, 11 }:
						compare 9 with 9 -> Equal
						return
	We started with N-element. Next step we divide array by N/2. Then N/4. We stopped, we number of
	element is just one.
	N = 16
	N = 8   / 2
	N = 4   / 2
	N = 2   / 2
	N = 1   / 2
	Let's look this in reverse order. How many times we multiply 1 by 2 to get N?
	N = 1
	N = 2  /  *2
	N = 4  /  *2
	N = 8  /  *2
	N = 16 /   *2
	2^k = N. What is k? K is exactly expresses log.
	2 ^ 4 = 16 -> log2 16 = 4
	log2 N = k -> 2^k = N
	Now, if we see problem get half each time, the complexity will be O(log N)
	Binary search video explanation: https://youtu.be/P3YID7liBug
*/

func sum(n int) int {
	if n <= 0 {
		return 0
	}

	return n + sum(n-1)
}

func pairSumSequence(n int) int {
	sum := 0
	for i := 0; i < n; i++ {
		sum += pairSum(i, i+1)
	}
	return sum
}

func pairSum(x int, y int) int {
	return x + y
}

func binarySearch(n [9]int, x int, left int, right int) bool {
	if left > right {
		return false
	}
	fmt.Println("left => ", left, " right => ", right, " searching on ", n[left:right+1])
	mid := left + (right-left)/2
	if x == n[mid] {
		return true
	} else if x < n[mid] {
		return binarySearch(n, x, left, mid-1)
	} else {
		return binarySearch(n, x, mid+1, right)
	}
}

func main() {
	result := sum(10)
	fmt.Println(result)

	pairSum := pairSumSequence(10)
	fmt.Println(pairSum)

	var numbers = [9]int{1, 5, 8, 9, 11, 13, 15, 19, 21}
	var res bool
	res = binarySearch(numbers, 12, 0, len(numbers)-1)
	fmt.Println(res)

}
