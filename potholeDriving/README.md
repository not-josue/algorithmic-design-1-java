# Sorting Rectangles

## Objective

Write a program where the user creates and sorts a collection of rectangles in a variety of ways based on their area, and gives the average area, minimum area, and maximum area.

## Requirements

### Data Structures

- Only use 2D Arrays to solve this problem

### Create the 2D Environment

- The environment must be represented by a Matrix (2D Array) whose size is 10x10.
- The program must then randomly select and assign exactly 5 unique cells in the matrix for the "potholes".
- Unique meaning that if program randomly selects a cell in the matrix that already has a pothole, then the program must keep selecting new cells while it has not found an empty cell (alternatively until an empty cell is selected).
- The program must then assign the car (player) to the top left cell represented by the indices [0][0] and home to the bottom right cell represented by the indices [9][9].

### Display the Game

- Before prompting the user, the program must show the environment, where the player is clearly indicated by the character 'X' and the home space is clearly indicated by the character '^'.
- The display must hide all the potholes from the user's view, and only show the player as an 'X' and the home space as a '^'.

### User Input and Display

- The program must clearly indicate to the player how to move their car.
- The player must be able to move the car in 8 directions,
N, S W, E, NW, NE, SW, SE
- The player may only move one space at a time (one cell at a time).
- Once the player has input the directions, the program must validate the input and move the player to a space only if it is within the bounds of the environment.
- Make sure to check for valid indices from 0 to 9.
- If the input entered is invalid, then the program must indicate this to the player and the player's car does not move.

### Win or Lose

- The program must determine if the player has either won or lost, and clearly display this to the player.
- The player wins whenever they successfully reach the home space without encountering a pothole.
- The player automatically loses if they land on a space with the pothole.

### Replay the Game

- When the player has either won or lost, then the program must ask if they would like to play again.
- If the user answers yes, then the game is reset and they start over.
- Otherwise, the program must terminate.

## Example Dialogue:
Welcome to Pothole Driving!  Get home while avoiding potholes!

X_________  

__________  

__________  

__________  

__________  

__________  

__________  

__________  

__________  

_________^  
Enter either a -1, 0, or 1 in the X or 9 to quit  

1  

Enter either a -1,0, or 1 in the Y  

1  

__________  

_X________  

__________  

__________  

__________  

__________  

__________  

__________  

__________  

_________^  

Enter either a -1, 0, or 1 in the X or 9 to quit  

0  

Enter either a -1,0, or 1 in the Y  

1  

__________  

__________  

_X________  

__________  

__________  

__________  

__________  

__________  

__________  

_________^  

Enter either a -1, 0, or 1 in the X or 9 to quit  

-1  

Enter either a -1,0, or 1 in the Y  

1  

OH NO! POTHOLE!  

Would you like to play again?  

No  

Goodbye!