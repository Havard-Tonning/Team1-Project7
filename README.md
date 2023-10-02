# Practice07

Team members: Antonij Conev, Dobrinka Gocheva, Håvard Tonning, Lyuboslav Gigov, Theodore Boyadjiev

Plan:
Create a program that reads a 4-digit input from the user. If the number is valid, it checks if it is a telemarketer and outputs the result.



How:
Initialize the Scanner:
Create a Scanner object to read user input. 

Prompt for User Input:
Display a message asking the user to enter a four-digit phone number.
Read the input from the user.

Check Input Validity:
Verify if the entered input is exactly four characters long. If not, print an error message and exit.

Check Telemarketer Criteria:
Extract the first, second, third, and fourth digits from the input phone number.
Check if the first digit is '8' or '9'.
Check if the fourth digit is '8' or '9'.
Check if the second and third digits are the same.

Display Result:
If the criteria are met, print a message advising to ignore the call.
If the criteria are not met, print a message advising to answer the call.

Close the Scanner:
Close the Scanner to release resources.
