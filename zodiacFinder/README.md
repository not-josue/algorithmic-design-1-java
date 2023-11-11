# Zodiac Finder

## Objective

Write a program that determines a person's astrological zodiac sign based on their birthday.

## Requirements

### Input

- User Inputs a Date as two separate whole number values.
- The user must be prompted to enter the month followed by the day.
- Both of these must be the numeric values representing the month and day, and this detail must be explained to the user.

### Check the Month

- A valid month is between 1 and 12.
- If the user enters a numeric value that is outside of that range, they must be informed that it is invalid.
- It is not required to check for non-numeric values (such as a character or String) for this problem.

### Check the Day

- This depends on the month.
- April, June, September, and November have between 1 and 30 days.
- Assume February has 29 days.
- All other months have between 1 and 31 days.
- If the user enters a numeric value that is outside of those ranges, they must be informed that it is invalid.
- It is not required to check for non-numeric values (such as a character or String) for this problem.

### Determine the Zodiac and Print Results

- Zodiac Signs are based on their dates,
- Aries = March 21 to April 19
- Taurus = April 20 to May 20
- Gemini = May 21 to June 20
- Cancer = June 21 to July 22
- Leo = July 23 to August 22
- Virgo = August 23 to September 22
- Libra = September 23 to October 22
- Scorpio = October 23 to November 21
- Sagittarius = November 22 to December 21
- Capricorn = December 22 to January 19
- Aquarius = January 20 to February 18
- Pisces = February 19 to March 20
- Their results must be printed.

## Example Dialogue

### 1.

What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.

5 2

You are a Taurus!

### 2.

What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.

-6 22

Invalid Month!

### 3.

What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.

12 -12

Invalid Day!

### 4.

What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.

9 31

Invalid Day!