# Date and Time Methods

## Objective

Write a class that will test dates and times inputted by the user and determine whether or not it is valid. This will focus on the usages of methods to organize code.

## Requirements

### Set Up Project

- DO NOT ALTER THE DRIVER
- Create a class and name it exactly DateAndTimeTester with NO main method
- Create methods in the DateAndTimeTester class

### Class

- For reference MM/DD hh:mm is Month / Day Hour : Minute respectively.
- run (): This method returns nothing and takes no parameters. This is called by the driver and should handle all of the input from the Scanner and dialog for the user.
- isValid (): returns true or false if a given String has the correct date and time. The String parameter should be formatted "MM/DD hh:mm" This method should call the methods isValidDate and isValidTime to determine this.
    - Also, the MM, DD, hh, and mm could either be single or double digits. Meaning that "09/09 01:01" is equally as valid as "9/9 1:1".
- isValidDate (): returns true or false if a given String has a correct date. The String parameter should be formatted "MM/DD" and should use the method getMonth and getDay to determine the date's validity. Also assume February only has 28 days.
- isValidTime (): returns true or false if a given String has a correct time. The String parameter should be formatted "hh:mm" and should use the getHour and getMinute to determine the time's validity. Valid times are from 1 to 12.
- getMonth (): returns an integer value representing the month for a given String. The String parameter is expected to be formatted "MM/DD".
- getDay (): returns an integer value representing the day for a given String. The String parameter is expected to be formatted "MM/DD".
- getHour (): returns an integer value representing the hour for a given String. The String parameter is expected to be formatted "hh:mm".
- getMinute (): returns an integer value representing the minute for a given String. The String parameter is expected to be formatted "hh:mm".
- HINT: For each one of the methods pay close attention to how the data is separated (delimited). For instance, we can see that Month and Day are separated using a '/', and finding the index of this character can help us to separate the Month from the Day.

## Example Dialogue

```
Enter a date and time (MM/DD hh:mm) and I will determine if it is valid  
06/22 3:00  
The date and time is valid!  
Would you like to exit? Type "quit" to exit or press [ENTER] to continue  

Enter a date and time (MM/DD hh:mm) and I will determine if it is valid  
9/31 12:00  
The date and time is not valid  
Would you like to exit? Type "quit" to exit or press [ENTER] to continue  

Enter a date and time (MM/DD hh:mm) and I will determine if it is valid  
12/08 13:00  
The date and time is not valid  
Would you like to exit? Type "quit" to exit or press [ENTER] to continue  
quit  
Good bye  
```