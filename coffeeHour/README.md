# Coffee Hour

## Objective

Create a program that has a class to represent a cup of coffee that combines the properties: name and caffeine content. The class should also have a method that calculates the number of cups that would be maximally risky to consume in a short period of time. The program should create two instances of the class coffee where the user enters their properties and should output the number of coffees that consumed would be risky.

## Requirements

### Coffee Class

- Create a Class named Coffee, omit the main method.

#### Instance Variables

- Name: A non-null String that represents the name of the Coffee. Its default value must be "none"
- Caffeine content:  The amount of caffeine in a single cup of coffee. Its values must be between 50 to 300mg inclusively and its default value should be 50.
- Every scope must be private.

#### Default Constructor

- Each instance variable must be assigned a valid default value.
- The default values of each instance variable can be found in the section "Instance Variables"

#### Parameterized Constructor

- Must include a parameter for each instance variable.
- Parameters must be checked for valid values before they are assigned. Valid values can be found in the section "Instance Variables".

#### Accessors

- Must follow general naming conventions, and structure.

#### Mutators

- Each mutator must check for valid values before assigning. If the parameter value is not correct, then the mutator must set the instance variable to a default value.
- Default and valid values can be found in the section "Instance Variables".
- Must follow general naming conventions, and structure.

#### toString() method

- Must return a String formatted as,
```
Coffee Name: <<coffee's name>> Caffeine Amount: <<coffee's caffeine amount>>
```
- Where coffee's name and coffee's caffeine amount are the instance variable values.

#### equals() method

- Must have a parameter for another Coffee's instance.
- The method must return true or false based on if this coffee's instance variables match the other coffee's instance variables.

#### riskyAmount() method

- Must require no parameters and must return a decimal value representing the number of cups that would be dangerous to consume within an hour.
- This value is based on the coffee's caffeine content and can be calculated by,
```
Risky Cup Amount = 180.0 / ((Caffeine Content / 100.0)*6.0)
```

### CoffeeTester Class

- Includes the main method.
- Creates 2 instances of Coffee.
- The user must be asked to enter the name and caffeine content of both coffees, and those values must be assigned as long as they are valid.
- The program must then print out the properties of each coffee (name and caffeine content) and print out the number of cups that if consumed within an hour would be a health risk.
- The program must then determine if the two coffee's have the same properties.
- Finally, the user must be prompted to either stop the program or restart it.

## Example Dialogue:
```
Let's Coffee!!!1!11!!ONE!!!1!  
  
What's the name of the first coffee?  
Double Triple Loca Mocha Latte Venti Grande  
  
What's the caffeine content?  
150  
  
What's the name of the second coffee?  
Waffle House Coffee  
  
What's the caffeine content?  
100  
  
It would take 20.0 Double Triple Loca Mocha Latte Venti Grande coffees before it's dangerous to drink more.  
It would take 30.0 Waffle House Coffee coffees to before it's dangerous to drink more.
```