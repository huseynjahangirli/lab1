QUESTION 1: Why can't we rely on CPU exetution time?

ANSWER 1: We can't rely on CPU execution time to measure an algorithm's efficiency because it's not a fair test. The time depends on many things, not just the algorithm itself.
Example: Hardware, Other Programs, Compiler, Input Data,...
Because of these factors, computer scientists use Time Complexity (Big O Notation). This method is abstract and focuses on how the number of operations grows as the input size (n) gets bigger. It's a universal way to compare algorithms.

QUESTION 2: How many operations does this code execute?

CODE: int sum = 0;
      sum = sum + 5;
      
ANSWER 2: The code has two lines, but it performs a few basic operations:
int sum = 0;: This is one operation (assigning a value).
sum = sum + 5;: This is two operations (one for addition, one for assigning the result).
So, in total, there are 3 fundamental operations.

QUESTION 3: Give the final time complexity of the code.

CODE:
a) int sum = 0;
         for(int i = 0; i < n; i++){
           sum += i;
         }

b) int sum = 0;
   for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
         sum += i + j;
        }
    }
    
c) int n = 1024;
   int count = 0;
    while (n > 1) {
      n = n / 2;
      count++;
      System.out.println("n = " + n);
      }
   System.out.println("Total divisions: " + count);
   
ANSWER 3: We need to find the Big O notation for each code snippet.
a. for (int i = 0; i < n; i++): This loop runs n times. The number of operations is directly proportional to n. The time complexity is O(n) (linear).
b. Nested for loops: The first loop runs n times. The second loop also runs n times for each step of the first loop. This means the operations run n×n=n2 times. The time complexity is O(n2) (quadratic).
c. while (n > 1): In this loop, n is divided by 2 in each step. To reach 1, you have to divide n by 2 a number of times. This number is the logarithm of n. The time complexity is O(logn) (logarithmic).
