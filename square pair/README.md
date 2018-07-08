.Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y and x + y is a perfect square. A perfect square is an integer whose square root is also an integer, e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not. Write a function named countSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the array. For example, if the array is {11, 5, 4, 20} the function would return 3 because the only square pairs that can be constructed from those numbers are <5, 11>, 
<5, 20> and <4, 5>.  You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0.

If you are programming in Java or C#, the function signature is
	int countSquarePairs(int[ ] a)

If you are programming in C++ or C, the function signature is
	int countSquarePairs(int a[ ], int len)  where len is the number of elements in the array.

You may assume that there are no duplicate values in the array, i.e, you don't have to deal with an array like {2, 7, 2, 2}.

Examples:

if a is | return | reason
---|---|---
{9, 0, 2, -5, 7} | 2 The square pairs are <2, 7> and <7, 9>. Note that <-5, 9> and <0, 9> are not square pairs, even though they sum to perfect squares, because both members of a square pair have to be greater than 0. Also <7,2> and <9,7> are not square pairs because the first number has to be less than the second number.
{9} | 0 | The array must have at least 2 elements
