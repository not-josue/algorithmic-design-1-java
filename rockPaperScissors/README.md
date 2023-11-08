# Rock, Paper, Scissors

## Objective

Write a program that simulates a game of rock, paper, scissors between a human and a computer opponent in best 2 out of 3 rounds.

## Requirements

### Interface

- Users should easily understand what the program does and how to use it.
- Users should be prompted for input and should be able to enter data easily.
- Users should be presented with output after major functions, operations, or calculations.

### Round Calculation

- The user must select either 'Rock', 'Paper', or 'Scissors'.
- The computer opponent must randomly select either 'Rock', 'Paper', or 'Scissors' each round.
- A winner must be determined by examining the user's input and the computer's selection.
- Rock vs Paper = Paper Wins.
- Paper vs Scissors = Scissors Wins.
- Scissors vs Rock = Rock Wins.
- Each winner receives 1 point.
- In the event of a tie there is no winner, and no points are awarded.
- If the user enters an incorrect value, then the computer automatically wins that round and receives a point.
- The results of each round must be displayed: either a winner or a tie.

### End of Game Calculation

- The program must determine and display an overall winner after exactly 3 rounds via their points.
- In the event of a tie, then the program must display that the user and the computer tied.

### Replayability

- Once the 3 rounds have concluded, the program must ask the user if they would like to play again.
- If the user answers yes, then the scores must be reset and the game restarts.
- Otherwise, the program must terminate.