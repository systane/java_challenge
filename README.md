
# Code Challenge:
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
Example:
Input: exp = “[()]{}{[()()]()}”
Output: Balanced
Input: exp = “[(])”
Output: Not Balanced

# Proposed solution:
It was written a java application using the stack data structure in order to help with the identification of
opening tokens "{", "(" and "[". From that, it was easy to determine which was the correct closing token.

# Executing the application:
1. Make share you have installed at least jdk 8: `java -version`
2. Open the project in any IDE of your preference e execute the main method. The program will 
