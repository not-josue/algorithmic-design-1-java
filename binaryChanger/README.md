# Binary Changer

## Objectives

Write a program that accepts two four-digit binary numbers, converts them to decimal values, adds them together, and prints both the decimal values and the result of the addition.

## Requirements

- Users must be able to enter a 4-bit binary number in some way

  - No error checking is needed here and you may assume that users will only enter 0’s and 1’s, and they will only enter 4 bits.

- Binary to Decimal Conversion

  - You may assume that users will only give numbers that add up to 15.

- Adding Values

  - Both decimal values must be added together and printed out.

- You may NOT use Integer.parseInt(<<STRING>>, 2) or any automatic converter
  - You may use Integer.parseInt(<<STRING>>)

## Hint

Input: 0111

| Binary Digit | Base 2 Value | Result |
| ------------ | ------------ | ------ |
| 0            | 2^3          | 0      |
| 1            | 2^2          | 4      |
| 1            | 2^1          | 2      |
| 1            | 2^0          | 1      |

Output: 0 + 4 + 2 + 1 = 7
