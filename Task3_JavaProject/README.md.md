**Project Title: Random Password Generator (Java)**



This is a simple console-based **" Random Password Generator "** written in Java.  

It allows the user to generate secure passwords based on custom criteria such as length and character types.



**Features:**



1. &nbsp;User specifies the "length" of the password.

2\.  User can choose which character types to include:

&nbsp;       \* Uppercase letters (A–Z)  

&nbsp;       \* Lowercase letters (a–z)  

&nbsp;       \* Numbers (0–9)  

&nbsp;       \* Special characters (!@#$%^\&\*()-\_=+<>?/)  



3\.  Ensures at least one character set is selected.

4\.  Generates and displays a **" random password "** using the chosen options.



**How It Works:**



1\. The program uses:

&nbsp;      \* Scanner → to take user input.

&nbsp;      \* Random → to generate random characters.

&nbsp;      \* StringBuilder → to build the password efficiently.

2\. Steps:

&nbsp;  \* Ask the user for desired password length.

&nbsp;  \* Prompt the user for each character type (uppercase, lowercase, numbers, special characters).

&nbsp;  \* Combine the selected sets into a **"characterPool".**

&nbsp;  \* Randomly pick characters from the pool until the password reaches the desired length.

&nbsp;  \* Display the generated password.





**How to Run:**



1\. Save the code as **"RandomPasswordGenerator.java"**.

2\. Compile the program:

&nbsp;                 **javac RandomPasswordGenerator.java**

3\. Run the program:

                  **java RandomPasswordGenerator**





**Example Run:**



**Enter desired password length: 12**

**Include uppercase letters? (y/n): y**

**Include lowercase letters? (y/n): y**

**Include numbers? (y/n): y**

**Include special characters? (y/n): y**



**Generated Password: Ab9!fG2$Xy@Q**



