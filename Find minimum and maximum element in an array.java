/*  [Basic]
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789

Your Task:  
You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <=1012
*/

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0];
        long max=a[0];
        for(int i=0;i<n;i++){
           min=Math.min(min,a[i]);
           max=Math.max(max,a[i]);
        }
        
        return new pair(min,max);
    }
}
