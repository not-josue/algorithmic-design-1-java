# Triangle Maker

## Objective

Write a program that takes in a positive number and draws a horizontal triangle of asterisks (*).  The inputted number represents the size of the triangle, or in other words the number of asterisks at the peak.  It starts out by increasing the number of asterisks at each line until it reaches the size of the triangle and then decreases the number of triangles at each line.

## Requirements

### Interface

- Users should be prompted for input and should be able to enter data easily.
- Users should be presented with output after major functions, operations, or calculations.
- The user must be prompted to enter the size of the triangle.

### Check for Errors

- The user must enter a non-zero, positive, whole number that corresponds to the size of the triangle.
- If the user enters anything else, then the program should inform the user of the error then immediately terminate.

### Drawing the Triangle

- The program must draw the triangle in the console using asterisks ("*").
- The triangle drawn must start with a single asterisk, then increase the number of asterisks line-by-line until the size is reached, and finally decrease the number of asterisks line-by-line until a single asterisk remains.
- An example would be if the user inputs "4", then the triangle below would be drawn,
*
**
***
****
***
**
*

## Example Dialogue

Welcome to Triangle Maker!  Enter the size of the triangle.
3

*
**
***
**
*

DONE!