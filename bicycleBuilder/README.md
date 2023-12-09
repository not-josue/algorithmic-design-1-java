# Bicycle Builder

## Objective

Practice object-oriented principles by building a bicycle out of multiple objects and test it with the tester.

## Requirements

### Set-Up the Project

- Do not alter the tester.
- The tester will be the only class with the main method.

### Create a Class called Wheel

#### Instance Variables

- Diameter: This represents the diameter of the wheel and must be between 16in to 55in inclusively. Its default value is 16.
- Width: This represents the width of the wheel and must be between 1in to 2.5in inclusively. Its default value is 1.

### Constructors

- Default: Must set all properties to their default values mentioned in the "Instance Variables" section.
- Parameterized: Must take in a parameter for each instance variable in the order named above. This means the first instance variable is the first parameter, the second instance variable is the second parameter, and so on. This must set the instance variable values only if the given values are valid, but otherwise it must set the instance variables to their default values.

### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of Wheel and only returns true if all of the instance variables match.
- ToString: This method returns a String with all of the instance variable values concatenated together with the format:  
```
[Wheel] Diameter <<Wheel's Diameter>> Width: <<Wheel's Width>>  
// Where values in "<<>>" correspond to the instance variable values.
```
### Create a Class called Frame

#### Instance Variables

- Size: This represents the frame's size and must be between 18.5in to 60 in inclusively. Its default value is 18.5.
- Type: This non-null String value represents the type of frame and can only be "Diamond", "Step-Through", "Truss", or "Penny-Farthing". Its default value is "Diamond"

#### Constructors

- Default: Must set all properties to their default values mentioned in the "Instance Variables" section.
- Parameterized: Must take in a parameter for each instance variable in the order named above. This means the first instance variable is the first parameter, the second instance variable is the second parameter, and so on. This must set the instance variable values only if the given values are valid, but otherwise it must set the instance variables to their default values.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of Frame and only returns true if all of the instance variables match.
- ToString: This method returns a string with all of the instance variable values concatenated together with the format:
```
[Frame] Size: <<Frame's Size>> Type: <<Frame's Type>>  
// Where values in "<<>>" correspond to the instance variable values.
```

### Create a Class called Bicyle

#### Instance Variables

- Make: This non-null String value represents the maker of the bicycles. Its default value is "none".
- FrontWheel: This is an instance of type Wheel and represents the front wheel of the bicycle. Its default value must be the default Wheel.
- BackWheel: This is another instance of type Wheel and represents the back wheel of the bicycle. Its default value must be the default Wheel.
- Frame: This is an instance of type Frame and represents bicycle's frame. Its default value is the default Frame.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of Bicycle and only returns true if all of the instance variables match. For name case should be ignored.
- ToString: This method returns a string with all of the instance variable values concatenated together with the format.
```
[Bicycle] Make: <<Bicycle's Make>> Front Wheel <<Bicycle's Front Wheel>> Back Wheel <<Bicycle's Back Wheel>> Frame: <<Bicycle's Frame>>  
// Where values in "<<>>" correspond to the instance variable values
```


## Example Dialogue:
```
---------------------------------  
Welcome to the Bicycle Builder Tester!  
---------------------------------  
  
First we will create a "Default" Bicycle  
Printing the Bicycle's data  
Bicycle's make: none  
Bicycle's front wheel: Diameter 16.0 Width: 1.0  
Bicycle's back wheel: Diameter 16.0 Width: 1.0  
Bicycle's frame: Size: 18.5 Type: diamond  
  
Testing the toString method  
[Bicycle] Make: none Front Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Back Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Frame: [Frame] Size: 18.5 Type: diamond  
  
Setting invalid values for the default bike's wheels and frame  
[Bicycle] Make: none Front Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Back Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Frame: [Frame] Size: 18.5 Type: diamond  
  
Creating another bike using the parameterized constructor  
[Bicycle] Make: Big Wheel Front Wheel: [Wheel] Diameter: 55.0 Width: 2.5 Back Wheel: [Wheel] Diameter: 18.0 Width: 2.0 Frame: [Frame] Size: 60.0 Type: Penny-Farthing  
  
Creating another bike using the parameterized constructor with invalid values  
[Bicycle] Make: none Front Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Back Wheel: [Wheel] Diameter: 16.0 Width: 1.0 Frame: [Frame] Size: 18.5 Type: diamond  
  
Checking the "equals" method  
Does the first and third bicycles have different memory addresses? true  
Does the first and third bicycles have the same properties? true  
  
---------------------------------  
Tests Complete! Goodbye  
---------------------------------  
```