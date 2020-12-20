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

*/

func sum(n int) int {
	if n <= 0 {
		return 0
	}

	return n + sum(n-1)
}

func main() {
	result := sum(10)
	fmt.Println(result)
}
