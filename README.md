Coffee Machine project from Hyperskill (https://hyperskill.org/projects/33?track=8)

There are six stages of the project.

 Stage 1: Making coffee
 
 Stage 2: Ingredient calculator
 
 Stage 3: Estimate the number of servings
 
 Stage 4: Buy, fill, take!
 
 Stage 5: Keep track of the supplies
 
 Stage 6: Brush up your code
 
 In stage 6, the idea of separating the signal file to three java class is based from the hints (https://hyperskill.org/projects/33/stages/180/implement).
 
 Although the output of stage 6 is same as stage 5, the use of stage 6 is let me to redesign the program, to let it simulates how the real world device work. In the normal oo program, we must define the class, and method in public, private, and protected to declare which data are allow for the user to access. So we cannot put all method in the same class/file. 
 
 Based on the hints, I created a class "Machine" which have a method that takes a string as input. Every time the user inputs a line (a string) to the console, the program invokes this method with one argument. The class for user to input the data is also required so I create another class "Menu" for user to input the data. I also create "Action" enum for the store the state types of the coffee machine. The coffee machine has several states it can be in. For example, the state could be "choosing an action" or "choosing a variant of coffee". Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same.
