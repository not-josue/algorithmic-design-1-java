# Below Average Temperature

## Objective

Write a program that takes in temperatures for 10 days and stores it in an array.  Find the average temperature for those 10 days, and then print the number of days and the temperatures that were strictly below the average.

## Requirements

### Data Structures

- Only use Arrays to store the collection

### Input

- The user must be able to enter the 10 temperatures.
- These temperatures must be stored in an Array of a decimal type.

### Finding the Average

- Once the temperatures have been entered, the average temperature must be calculated and displayed.
- The average is the sum of all of the values in the Array divided by the size (or length) of the Array.

### Printing all Temperatures Below Average

- Once the average has been calculated, the program must display all temperatures that are strictly below the average.
- If there are no temperatures strictly below the average, then the program should display nothing.

## Example Dialogue

Welcome to the below average temperature tester program.  
  
Please enter the temperature for day 1  
33.0  
Please enter the temperature for day 2  
20.0  
Please enter the temperature for day 3  
41.0  
Please enter the temperature for day 4  
48.0  
Please enter the temperature for day 5  
60.0  
Please enter the temperature for day 6  
51.0  
Please enter the temperature for day 7  
29.0  
Please enter the temperature for day 8  
71.0  
Please enter the temperature for day 9  
63.0  
Please enter the temperature for day 10  
66.0
  
The average temperature was 48.2  
  
The days that were below average were  
Day 1 with 33.0  
Day 2 with 20.0  
Day 3 with 41.0  
Day 4 with 48.0  
Day 7 with 29.0

## Test Cases

- Given the input <33.0, 20.0, 41.0, 48.0, 60.0, 51.0, 29.0 71.0, 63.0, 66.0> does the program print out:  
The average temperature was 48.2  
The days that were below average were  
Day 1 with 33.0  
Day 2 with 20.0  
Day 3 with 41.0  
Day 4 with 48.0  
Day 7 with 29.0  

- Given the input <10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0> does the program print out:  
The average temperature was 55.0  
The days that were below average were  
Day 1 with 10.0  
Day 2 with 20.0  
Day 3 with 30.0  
Day 4 with 40.0  
Day 5 with 50.0  

- Given the input <10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0> does the program print out:  
The average temperature was 10.0  
The days that were below average were