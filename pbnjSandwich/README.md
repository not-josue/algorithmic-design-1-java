# Peanut Butter & Jelly Sandwich

## Objective

Practice object-oriented principles by making two Peanut Butter and Jelly Sandwiches. The program must create two sandwiches based on user input. The sandwich information for both must then print out their details and determine if the two sandwiches are equal.

## Requirements

### Create a Class called Bread

#### Instance Variables

- Name: The name brand of the bread. This value should not be null, and its default value is “none”.
- Calories: The number of calories per slice assumed to be between 50 and 250 inclusively, and its default value is 50.
- Type: The kind of bread. This can either be “Honey Wheat”, “White”, “Whole Grain”, or “Whole Wheat”, and its default value is “Whole Grain”.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of Bread and only returns true if all of the instance variables match.
- ToString: This method returns a String with all of the instance variable values concatenated together.

### Create a Class called PeanutButter

#### Instance Variables

- Name: The name brand of peanut butter. This value should not be null, and its default value is “none”.
- Calories: The number of calories per serving assumed to be between 100 and 300 inclusively, and its default value is 100.
- IsCrunchy: True if the peanut butter is crunchy and false otherwise, and its default value is false.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of PeanutButter and only returns true if all of the instance variables match.
- ToString: This method returns a string with all of the instance variable values concatenated together.

### Create a Class called Jelly

#### Instance Variables

- Name: The brand name of the Jelly. This value should not be null, and its default value is “none”.
- Calories: The number of calories per serving assumed to be between 50 and 200 inclusively, and its default value is 50.
- FruitType: The type of fruit the jelly is made from and can only be “Apple”, “Blackberry”, “Grape”, “Blueberry”, or “Tomato”. Its default value is “Grape”.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the "Instance Variables" Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- Equals: This method takes in another instance of Jelly and only returns true if all of the instance variables match. For name case should be ignored.
- ToString: This method returns a string with all of the instance variable values concatenated together with the format.

### Create a Class called PBJSandwich

#### Instance Variables

- TopSlice: An instance of type Bread representing the top slice of bread. This type refers to the one that was described above, and its default value is the default Bread.
- PeanutButter: An instance of type PeanutButter representing the peanut butter. This type refers to the one that was described above, and its default value is the default PeanutButter.
- Jelly: An instance of type Jelly representing the jelly. This type refers to the one that was described above, and its default value is the default Jelly.
- BottomSlice: Another instance of type Bread representing the bottom slice of bread. This type refers to the one that was described above, and its default value is the default Bread.

#### Methods

- Accessors and Mutators for the instance variables
    - Make sure in the mutators check for valid values named in the Instance Variable Section.
    - Each of the instance variables must not be null.
- Equals: This method takes in another instance of PBJSandwich and only returns true if all of the instance variables match by calling their Equals methods.
- ToString: This method returns a string with all of the instance variable values.

### Create a Class called PBJFrontEnd

#### Main Method

- The program must create two instances of type PBJSandwich.
- User must be able to enter all the properties of the sandwiches which include all the properties of the top slice of bread, bottom slice of bread, jelly, and peanut butter.
- The program must then print out the values of the two sandwiches which include all the properties of the top slice of bread, bottom slice of bread, jelly, and peanut butter.
- The program must then determine if they are the same sandwich.
- The program must then ask the user if they would like to restart or quit.

## Example Dialogue 1:
```
-----------------------------------  
Welcome to the PBJ Sandwich Maker!  
-----------------------------------  
  
-----Sandwich 1-----  
Top Slice of Bread Information  
Enter name of the bread  
Wonder Bread  
Enter the number of calories  
80  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
whole wheat  
  
Peanut Butter Information  
Enter name of the peanut butter  
JIF  
Enter the number of calories  
190  
Is it crunchy? Enter "true", or "false"  
false  
  
Jelly Information  
Enter name of the jelly  
Smuckers  
Enter the number of calories  
150  
Enter the type of jelly. Must be "Apple", "Blueberry", "Grape", "Strawberry", or "Tomato"  
Apple  
   
Bottom Slice of Bread Information  
Enter name of the bread  
Wonder Bread  
Enter the number of calories  
120  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
honey Wheat  
   
-----Sandwich 2-----  
Top Slice of Bread Information  
Enter name of the bread  
Pepperidge Farm  
Enter the number of calories  
100  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
Whole grain  
  
Peanut Butter Information  
Enter name of the peanut butter  
Peter Pan  
Enter the number of calories  
180  
Is it crunchy? Enter "true", or "false"  
true  
  
Jelly Information  
Enter name of the jelly  
Welch's  
Enter the number of calories  
150  
Enter the type of jelly. Must be "Apple", "Blueberry", "Grape", "Strawberry", or "Tomato"  
Grape  
Bottom Slice of Bread Information  
Enter name of the bread  
Lender's  
Enter the number of calories  
150  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
Whole Wheat  
  
-----Sandwich 1-----  
PBJ Sandwich  
Top Slice:  
Bread  
Name: Wonder Bread  
Calories: 80  
Type: whole wheat  
Peanut Butter:  
Peanut Butter  
Name: JIF  
Calories: 190  
Is Crunchy: true  
Jelly:  
Jelly  
Name: Smuckers  
Calories: 100  
Fruit Type: Apple  
Bottom Slice:  
Bread  
Name: Wonder Bread  
Calories: 120  
Type: honey Wheat  
  
-----Sandwich 2-----  
PBJ Sandwich  
Top Slice:  
Bread  
Name: Pepperidge Farm  
Calories: 100  
Type: Whole grain  
Peanut Butter:  
Peanut Butter  
Name: Peter Pan  
Calories: 180  
Is Crunchy: true  
Jelly:  
Jelly  
Name: Welch's  
Calories: 100  
Fruit Type: Grape  
Bottom Slice:  
Bread  
Name: Lender's  
Calories: 150  
Type: Whole Wheat  
  
Are they the same sandwich? false
```

## Example Dialogue 2:
```
-----------------------------------  
Welcome to the PBJ Sandwich Maker!  
-----------------------------------  
  
-----Sandwich 1-----  
Top Slice of Bread Information  
Enter name of the bread  
Wonder  
Enter the number of calories  
100  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
White  
  
Peanut Butter Information  
Enter name of the peanut butter  
JIF  
Enter the number of calories  
150  
Is it crunchy? Enter "true", or "false"  
false  
  
Jelly Information  
Enter name of the jelly  
Welchs  
Enter the number of calories  
150  
Enter the type of bread. Must be "Apple", "Blueberry", "Grape", "Strawberry", or "Tomato"  
Grape  
  
Bottom Slice of Bread Information  
Enter name of the bread  
Wonder  
Enter the number of calories  
100  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
White  
  
-----Sandwich 2-----  
Top Slice of Bread Information  
Enter name of the bread  
Wonder  
Enter the number of calories  
100  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
white  
  
Peanut Butter Information  
Enter name of the peanut butter  
JIF  
Enter the number of calories  
150  
Is it crunchy? Enter "true", or "false"  
false  
  
Jelly Information  
Enter name of the jelly  
Welchs  
Enter the number of calories  
150  
Enter the type of bread. Must be "Apple", "Blueberry", "Grape", "Strawberry", or "Tomato"  
grape  
  
Bottom Slice of Bread Information  
Enter name of the bread  
wonder  
Enter the number of calories  
100  
Enter the type of bread. Must be "Honey Wheat", "White", "Whole Grain", or "Whole Wheat"  
white  
  
-----Sandwich 1-----  
PBJ Sandwich  
Top Slice:  
Bread  
Name: Wonder  
Calories: 100  
Type: White  
Peanut Butter:  
Peanut Butter  
Name: JIF  
Calories: 150  
Is Crunchy: true  
Jelly:  
Jelly  
Name: Welchs  
Calories: 100  
Fruit Type: Grape  
Bottom Slice:  
Bread  
Name: Wonder  
Calories: 100  
Type: White  
  
-----Sandwich 2-----  
PBJ Sandwich  
Top Slice:  
Bread  
Name: Wonder  
Calories: 100  
Type: white  
Peanut Butter:  
Peanut Butter  
Name: JIF  
Calories: 150  
Is Crunchy: true  
Jelly:  
Jelly  
Name: Welchs  
Calories: 100  
Fruit Type: grape  
Bottom Slice:  
Bread  
Name: wonder  
Calories: 100  
Type: white  
  
Are they the same sandwich? true
```