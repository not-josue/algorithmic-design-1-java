# Sorting Laundry

## Objective

Write a program that will sort a basket of clothes into their proper drawers.  If you were not aware you are sort clothes by their type in this order:

- Top Drawer : Undergarments
- Next Drawer : Socks or Stockings
- The Following Drawer : Tops
- The Subsequent Drawer : Bottoms
- The Cape Drawer : Capes

## Requirements

### Create a Class called Clothing

#### Instance Variables

- Type: A value that represents the type of clothing, and can only have the value “Undergarment”, “Socks”, “Stockings”, “Top”, “Bottom”, or “Cape”. Its default value should be “Socks”
- Color: A value that represents the color of the clothing, and can only have the value “Brown”, “Red”, “Pink”, “Black”, “White”, “Orange”, “Green”, “Blue”, “Purple”, or “Grey”. Its default value should be “Black”.

#### Constructors

- Default: Must set all properties to their default values mentioned in the “Instance Variables” section.
- Parameterized: Must take in a parameter for each instance variable in the order named above. This means the first instance variable is the first parameter, the second instance variable is the second parameter, and so on. This must set the instance variable values only if the given values are valid, but otherwise it must set the instance variables to their default values.

#### Methods

- Accessors for the instance variables.
- Mutators for the instance variables.
    - Make sure in the mutators check for valid values named in the “Instance Variables” Section.
    - If the value that is being set is not valid, then set the instance variable to its default value.
- toString: This method returns a String with all of the instance variable values concatenated together with the format:
```
[Clothing] Type: <<Type>> Color: <<Color>>
```
- Where values in “<<>>” correspond to instance variable values.
- Equals: This method takes in another instance of Clothing and only returns true if all of the instance variables match.

### Create a Class called Dresser

#### Instance Variables

- Clothes: This is a 2D array of type clothing where it has 5 Drawers that can only hold 10 items of clothing.
- All must have the private scope

#### Constructors

- Default: Must construct the clothes array given the correct dimensions.

#### Methods

- No Accessors of Mutators.
- Add: Takes in an instance of Clothing as a parameter and returns nothing.  The parameter is then sorted in their proper drawers by its type as mentioned above.  If a drawer is full make sure to tell the user.
- Remove: Takes in an instance of Clothing as a parameter and returns nothing.  This method searches for a piece of clothing, and if it exists it is removed. This can be done by either setting the value to null or shifting memory addresses.
- Print: This prints out every piece of clothing’s information in the dresser to the console.

### Create a Class called DresserFrontEnd

- Include the main method.
- The program must prompt the user with the options
    - Add Clothes to the Dresser
    - Remove Clothes from the Dresser
    - Quit
- If the user chooses to add clothes to the dresser, then the user must be prompted to enter the clothes’ information. Once entered the program must add the new article of clothing to the correct dresser drawer. If that drawer is full, then the program may ignore the request.
- If the user chooses to remove clothes from the dresser, then the user must be prompted to enter the clothes’ information. Once entered the program must search and remove that article of clothing from the dresser. If the item being removed does not exist in the dresser, then the program may ignore the request.
- After every operation, the program must clearly print out the items contained in the dresser.

## Example Dialogue 1:
```
Welcome to the dresser!

Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
1

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
top

Enter a color
It may be brown, pink, orange, green, blue, purple, or grey
red
 
Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
1

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
cape

Enter a color
It may be brown, pink, orange, green, blue, purple, or grey
purple

Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
1

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
socks

Enter a color
It may be brown, pink, orange, green, blue, purple, or grey
grey
 
Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
1

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
cape

Enter a color
It may be brown, pink, orange, green, blue, purple, or grey
blue

Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
1

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
undergarment

Enter a color
It may be brown, pink, orange, green, blue, purple, or grey
pink

Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
3

Drawer 0
undergarment pink

Drawer 1
socks grey

Drawer 2
top red

Drawer 3

Drawer 4
cape purple
cape blue

Enter 1: to add an item
Enter 2: to remove an item
Enter 3: to print out the dresser contents
Enter 9: to quit
2

Enter the type
It may be undergarment, socks, stockings, top, bottom, or cape
socks

Enter a color  
It may be brown, pink, orange, green, blue, purple, or grey  
grey  
  
Enter 1: to add an item  
Enter 2: to remove an item  
Enter 3: to print out the dresser contents  
Enter 9: to quit  
3  
  
Drawer 0  
undergarment pink  
  
Drawer 1  
  
Drawer 2  
top red  
  
Drawer 3  
  
Drawer 4  
  
cape purple  
cape blue  
  
Enter 1: to add an item  
Enter 2: to remove an item  
Enter 3: to print out the dresser contents  
Enter 9: to quit  
9  
  
Goodbye
```