3. An array is defined to be n-unique if exactly one pair of its elements sum to n. For example, the array {2, 7,  3, 4} is 5-unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not 5-unique because a[0] + a[1] = 5 and a[0] + a[2] = 5.  

Write a function named isNUnique that returns 1 if its integer array argument is n-unique, otherwise it returns 0. So isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and 
isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.

If you are programming in Java or C#, the function signature is
    int isNUnique(int[ ] a, int n)

If you are programming in C or C++, the function signature is
    int isNUnique(int a[ ], int len, int n) where len is the number of elements in the array.

Examples

If a is | and n is | return | because
---|---|---|---
{7, 3, 3, 2, 4} | 6 | 0 | because a[1]+a[2] == 6 and a[3]+a[4] also == 6.
{7, 3, 3, 2, 4} | 10 | 0 | because a[0]+a[1] == 10 and a[0] + a[2] also == 10
{7, 3, 3, 2, 4} | 11 | 1 | because only a[0] + a[4] sums to 11
{7, 3, 3, 2, 4} | 8 | 0 | because no pair of elements sum to 8. (Note that a[1]+a[2]+a[3] do sum to 8 but the requirement is that two elements sum to 8.)
{7, 3, 3, 2, 4} | 4 | 0 | no pair of elements sum to 4. (Note that the a[4]==4, but the requirement is that two elements have to sum to 4.)
{1} | anything | 0 | array must have at least 2 elements
