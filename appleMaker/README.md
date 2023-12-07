# Apple Maker

## Objective

Write a program that creates a class Apple and a tester to make sure the Apple class is crisp and delicious.

## Requirements

### Create Class

- Create a class and name it Apple.

### Create the following Instance Variables for the class Apple.

- Type: A string that describes the apple.  The type must not be null and can only be "Red Delicious", "Golden Delicious", "Gala", or "Granny Smith" and its default value is "Gala".
- Weight: A decimal value representing the apple's weight in kilograms. The weight must be between 0kg and 2kg both inclusive, and its default value is 0.0.
- Price: The price per apple. This must be a non-negative decimal value and its default value is 0.0.
- Every scope must be private.

### Create a Default Constructor for the class Apple.

- Each instance variable must be assigned a valid default value.
- The default values for each instance variable can be found in the section "Create the following Instance Variables...".

### Create a Parameterized Constructor for the class Apple.

- Must include a parameter for each instance variable.
- Parameters must be checked for valid values before they are assigned. Valid values can be found in the section "Create the following Instance Variables...".

### Create Accessors for each instance variable for the class Apple.

- Must follow commonly used structure and naming conventions

### Create Mutators for each instance variable for the class Apple.

- Each mutator must check for valid values before assigning. If the parameter value is not correct, then the mutator must set the instance variable to a default value.
- Default and valid values can be found in the section "Create the following Instance Variables...".
- Must follow commonly used structure and naming conventions

### Create a "toString" method for the class Apple.

- Does not have parameters.
- Must return a String formatted as:  
```
Type: <<apple's name>> Weight <<apple's weight>> Price <<apple's price>>
```
- Where apple's name, weight, and price are the instance variable values.

### Create an "equals" method for the class Apple.

- Must have a parameter for another Apple's instance.
- The method must return true or false based on if this apple's instance variables match the other apple's instance variables.

### Create a class and name it AppleTester.

- Include the "main method"
- Create (Construct) 3 different instances of Apples.
- Demonstrate that the Default and Parameterized Constructors are working correctly.
- Demonstrate that the Accessors and Mutators are working correctly.
- Demonstrate that the "toString" and "equals" methods are working correctly.

## Example Dialogue:
```
Welcome to the apple tester  
  
Creating a default apple  
Printing the default apple's value  
Type: Gala Weight: 0.0 Price: 0.0  
  
Creating another apple  
Setting the new apple's values to the following, valid values  
"Granny Smith 0.75 0.99"  
Printing the new apple's values  
Type: Granny Smith Weight: 0.75 Price: 0.99  

Creating another defult apple  
Then setting the new apple's values to the following, invalid values "iPad 2.5 -200"  
Printing the newest apple's values which should not have changed from the default values  
Type: Gala Weight: 0.0 Price: 0.0  
  
Checking if the first and last apple have the same values.  
True  
```