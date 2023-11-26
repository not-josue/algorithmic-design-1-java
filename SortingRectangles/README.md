# Sorting Rectangles

## Objective

Write a program where the user creates and sorts a collection of rectangles in a variety of ways based on their area, and gives the average area, minimum area, and maximum area.

## Requirements

### Data Structures

- Only use Arrays to store the collection

### Sorting

- Do not use built-in sorters
- You must implement all sorting yourself.
- You MAY NOT use built-in Java sorters such as anything in "import java.util.*" or "import java.util.Arrays".

### Interface

- Users should be presented with output after major functions, operations, or calculations.
- The user must be presented with the options:
    - Enter Rectangle Data : Both the size of the collection and each individual rectangle's length and width.
    - Sort and display the Rectangles' areas from Smallest to Largest.
    - Sort and display the Rectangles' areas form Largest to Smallest.
    - Display the Average Area of the rectangles
    - Display the Minimum area in the collection.
    - Display the Maximum area in the collection.
    - Quit the program.
- If the user picks an invalid option, then the program must inform the user and continue.

### Input

- The user must be able to specify the size of the collection (the array). If the size is invalid, then the program must keep asking the user for a valid size. The program should not terminate if an invalid size is entered.
- After creating the collection, the user must be able to enter the data - the length and width of the rectangle. The length and width can be any decimal value: positive, negative, or zero.

### Sort and Display

- The user must be able to sort the rectangles by their area either from smallest to largest (ascending order) or from smallest to largest (descending order).
- Area of a rectangle is the length x width.
- If the user tries to sort a collection that has not been created (in other words an empty Array), then the program must inform them it cannot sort an empty collection.
- Once the collection has been sorted the areas must be printed to the console.

### Displaying Avg Area

- The user must be able to request the average area of the collection and the program must display the average area.
- The average is the sum of all the areas divided by the number of items in the collection.
- If the user tries to sort a collection that has not been created (in other words an empty Array), then the program must inform them it cannot sort an empty collection.

### Displaying the Min Area

- The user must be able to request the minimum area in the collection and the program must display it.
- If the user tries to find the minimum in a collection that has not been created (in other words an empty Array), then the program must inform them it cannot find the minimum in an empty collection.

### Displaying the Max Area

- The user must be able to request the maximum area in the collection and the program must display it.
- If the user tries to find the maximum in a collection that has not been created (in other words an empty Array), then the program must inform them it cannot find the maximum in an empty collection.