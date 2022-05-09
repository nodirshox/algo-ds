package main

import "fmt"

/*
	Topic: Arrays
	Created at: 14/12/2020 by @nodirshox

	One of common type of data structure is Array.
	Main purpose of using array is store homogenoues(same type) data.
	Imagina we have students homework scores. Without data structure this could be solved by:

	student1 = 45, student2 = 55, student3 = 78, ...

	This can be solved by storing all of the results by inserting to array.

	int student_scores[10]

	Then we can store 10 students scores in one array.
	By defenition, arrays size is fixed. If we declare an array, computer allocate n number of locations.
	Accessing to data is fast. student_scores[7] is we can access 8-the element from array.
	We can immediately locate data when initializing: int[] grade = {44, 55, 78}    (* in C++)
	Array migh be one dimensional, two or three so on.
	Array always starts with zero index 0
	student_scores[-1] - BAD
	student_scores[10] - GOOD
	student_scores[1.5] - BAD
	student_scores[0] - GOOD

	Data structure operations:
	Traversing
	Searching
	Insertion
	Deletion
	Sorting
	Merging

	Problem: Find pick number from array of elements.
*/

func main() {
	fmt.Println("Arrays")
	var studentScores [5]int
	studentScores[0] = 55
	studentScores[1] = 12
	studentScores[2] = 78
	studentScores[3] = 99

	fmt.Println(studentScores)
}
