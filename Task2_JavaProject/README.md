**Project Title:** **Rock  Paper Scissors Game (Java)**



This is a simple console-based Rock, Paper, Scissors game written in Java.  

The user plays against the computer, which randomly selects one of the three options.



**Features:**



1. &nbsp;**User can choose:** " rock ", " paper ", or " scissors ".

2\.  Computer randomly selects one of the three options.

3\.  The program compares both choices and determines the winner based on standard rules:

&nbsp;            \* Rock beats Scissors

&nbsp;            \* Scissors beats Paper

&nbsp;            \* Paper beats Rock

4\.  Handles invalid input (prompts user to try again).

5\.  Game continues in a loop until the user types **" quit "**.

6\.  Gracefully exits with a goodbye message.



**How It Works:**



1\. **The program uses:**

&nbsp;  \* Scanner → to read user input from the console.

&nbsp;  \* Random → to generate the computer's choice.

&nbsp;  \* String\[] options → stores the possible choices: **" rock ", " paper ", " scissors ".**



2\. The main loop **(while (true))** keeps running until the user enters **" quit "**.

&nbsp;  \* If the input is invalid **(not rock/paper/scissors/quit),** it asks again.

&nbsp;  \* Otherwise, the computer generates a random choice.

&nbsp;  \* The game logic compares user vs. computer and prints:

&nbsp;  \* **"You win!", "You lose!", or "It's a tie!"**.



3\. The loop continues until the user types **" quit ".**



**How to Run:**



1\. Save the code as **" RockPaperScissors.java ".**

2\. Compile the program:

&nbsp;                    **javac RockPaperScissors.java**

3\. Run the program:

                  **java RockPaperScissors**



**Example Run:**



**Enter rock, paper, or scissors (or 'quit' to stop): rock**

**Computer choose: paper**

**You lose!**



**Enter rock, paper, or scissors (or 'quit' to stop): scissors**

**Computer choose: paper**

**You win!**



**Enter rock, paper, or scissors (or 'quit' to stop): quit**

**Thanks for playing! Goodbye!**



