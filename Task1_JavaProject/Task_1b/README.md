**Project Title: Number Guessing Game (Java)**



This is a simple console-based **" Number Guessing Game "** written in Java.  

The program randomly selects a number between "1 and 100", and the player tries to guess it.  

After each guess, the program provides hints until the player guesses correctly.



**Features:**



1. The computer randomly generates a number between "1 and 100".

2\. The player enters guesses from the console.

3\. **After each guess:**

&nbsp; \* Prints **"Too low! Try again."** if the guess is smaller than the number.

&nbsp; \* Prints **"Too high! Try again."** if the guess is larger than the number.

&nbsp; \* Prints **"Correct!"** when the guess matches the number.

&nbsp; \* Tracks the **" Number of attempts "** taken by the player.

&nbsp; \* Ends the game once the correct number is guessed.



**How It Works:**



1\. The program uses:

&nbsp;  \* Scanner → to read user input from the console.

&nbsp;  \* Random → to generate the secret number.

2\. The number to guess is chosen randomly:

&nbsp;  \* int numberToGuess = random.nextInt(100) + 1;(Generates a number between 1 and 100.)

3\. A while loop continues until the player guesses correctly.

4\. Each guess is compared with the secret number, and hints are displayed.

5\. When the correct number is guessed, the program shows how many attempts it took.





**How to Run:**



1. Save the code as **NumberGuessingGame.java.**

2\. Compile the program:

                      **javac NumberGuessingGame.java**

3\. Run the program:

                  **java NumberGuessingGame**



**Example Run:**



**Welcome to the Number Guessing Game!**



**Guess a number between 1 and 100:**



**Enter your guess: 50**

**Too high! Try again.**

**Enter your guess: 25**

**Too low! Try again.**

**Enter your guess: 37**

**Correct! You guessed the number in 3 attempts.**



