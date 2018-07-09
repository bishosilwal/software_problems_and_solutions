1. A perfect number is one that is the sum of its factors, excluding itself. The 1st perfect number is 6 because 6 = 1 + 2 + 3. The 2nd perfect number is 28 which equals 1 + 2 + 4 + 7 + 14. The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. In each case, the number is the sum of all its factors excluding itself. 

Write a method named henry that takes two integer arguments, i and j and returns the sum of the ith and jth perfect numbers. So for example, henry (1, 3) should return 502 because 6 is the 1st perfect number and 496 is the 3rd perfect number and 6 + 496 = 502.

The function signature is
    int henry (int i, int j)

You do not have to worry about integer overflow, i.e., you may assume that each sum that you have to compute can be represented as a 31 bit integer. Hint: use modulo arithmetic to determine if one number is a factor of another.
