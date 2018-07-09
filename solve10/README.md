1. It is a fact that there exist two numbers x and y such that  x! + y! = 10!. Write a method named solve10  that returns the values x and y in an array.

The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 * 1, e.g.,  5! = 5*4*3*2*1 = 120.

If you are programming in Java or C#, the function prototype is
   int[ ] solve10() where the length of the returned array is 2.

If you are programming in C++ or C, the function prototype is
   int * solve10() where the length of the returned array is 2.

Please be sure that the method solve10 returns an array, a, with two elements 
where a[0] == x, a[1] == y and x! + y! = 10!.