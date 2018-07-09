Q. The sum factor of an array is defined to be the number of times that the sum of the array appears as an element of the array. So the sum factor of {1, -1, 1, -1, 1, -1, 1} is 4 because the sum of the elements of the array is 1 and 1 appears four times in the array. And the sum factor of 
{1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10 does not occur as an element of the array. The sum factor of the empty array { } is defined to be 0.

Write a function named sumFactor that returns the sum factor of its array argument.

If you are programming in Java or C#, the function signature is
	int sumFactor(int[ ] a)

If you are programming in C++ or C, the function signature is
	int sumFactor(int a[ ], int len)  where len is the number of elements in the array.

Examples:


if a is | return | reason
---|---|---
{3, 0, 2, -5, 0} | 2 | The sum of array is 0 and 0 occurs 2 times
{9, -3, -3, -1, -1} | 0 | The sum of the array is 1 and 1 does not occur in array.
{1} | 1 | The sum of the array is 1 and 1 occurs once in the array
{0, 0, 0} | 3 | The sum of the array is 0 and 0 occurs 3 times in the array
