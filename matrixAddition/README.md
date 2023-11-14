# Matrix Addition

## Objective

Write a program that creates two matrices of whole numbers and then adds them!

$$ {\left\lbrack \matrix{4 & 1 \cr 8 & 7} \right\rbrack} + \left\lbrack \matrix{1 & 3 \cr 2 & 4} \right\rbrack= \left\lbrack \matrix{5 & 4 \cr 10 & 11}\right\rbrack
$$

## Requirements

### Data Structure

- Only use Arrays to represent the Matrices

### Creating Matrices

- We assume that our matrices only have only two dimensions (a 2D Array).
- Users must be able to specify the sizes of each Matrix - both length and width of both.

### Populating Matrices

- Users must be prompted to enter the individual values of each matrix (called components).
- They must be prompted value's position (the indices) is being entered.

### Adding Matrices

- The program must check to see if the length and width of one matrix matches the length and width of the other matrix. If they do not match, then the user must be prompted with an error message and the program must exit.
- The program must create a resulting matrix that is the same length and width.
- The program must add the values component wise and store the results in the resulting matrix.
Example. If we assume we have two matrices, A and B, and a resulting matrix C, then C[0][0] = A[0][0] + B[0][0], C[0][1] = A[0][1] + B[0][1], etc.

### Printing the Result

- The contents of both matrices entered by the user and the contents of the resulting matrix must be shown to the user.
- Components of each should be shown in their appropriate rows and columns.

## Example Dialogue

Welcome to the matrix adder program!  
Please enter the length and with of the first matrix  
2  
2  
Enter the value at index 0 0  
4  
Enter the value at index 0 1  
1  
Enter the value at index 1 0  
8  
Enter the value at index 1 1  
7  

Please enter the length and with of the second matrix  
2  
2  
Enter the value at index 0 0  
1  
Enter the value at index 0 1  
3  
Enter the value at index 1 0  
2  
Enter the value at index 1 1  
4  

4 1  
8 7  
+  
1 3  
2 4  
\=  
5 4  
10 11
