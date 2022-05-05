# SAaD_V2
#Task 4: Applying design patterns to three cases (30 pt.)

Below, you will be presented with three small example cases. For each of them, provide the
design and implementation for an appropriate design pattern. Use a different design pattern for each case. For each case, perform the following steps:

a) Create a class diagram showing how the implemented design pattern looks like for the
case.  (5 points per case)

b) Create a minimal implementation of the design pattern in Java, based on the design that
you created in the first sub-task. Comment on whether the implementation of the pattern
worked as planned and if no, why not.  (5 points per case)

#Case A: Strategy Game: Creating Military Units
In a strategy game, two parties face each other: inhabitants of the planets Mars (Martians) and Venus (Venusians). Each party is controlled by one player. Each player has a points account and can, as long as there is sufficient coverage of the account, create new units at any time, e.g. attack drones, helicopters, and inflatable boats. All units have the characteristics of speed, attack, and defence, the values of which can vary between parties (for example, the Martians have faster attack drones, while the inflatable boats of Venusians have stronger defence).

Use a design pattern to support the creation of new units.



#Case B: Coffee List Web Application.
Due to rising prices for coffee beans and machine maintenance, the Department of Computer Science will start charging their employees for their coffee consumption. There will be a web form (an online “coffee list”) in which employees record their current consumption. The department has a differentiated pricing: There are the varieties "Strong Roast" (3 SEK), "Normal Roast" (3 SEK), and “Espresso” (2 SEK). In addition, milk (1 SEK) and / or sugar (1 SEK) can be added to each cup.

Use a design pattern to support a structured representation of coffee list entries. Coffee list
entries should have a function for determining the price of the entry.

#Case C: In-File Search
Support the searching for a search string within a file. The search method should return the
number of occurrences of the search string as the return value. For example, in the case of a file containing the contents abababab and search string ab, the value 4 should be returned.

The search algorithm should be freely selectable.
The following algorithms should be available:
(1) API function: A library function is used (for example, of the class StringUtils).
(2) Brute Force: The text is searched from left to right. In each position, a test is made as to
whether the pattern fits.
(3) Shift-Or text search: The algorithm uses the Shift-Or string matching algorithm; see
https://www.educative.io/edpresso/shift-or-string-matching-algorithm

Implement the whole search using the pattern. It is OK to reuse code from online resources for this task – in that case, please put a reference to the online resources into your code.


Deliverables:
• Class diagram (one for each case)  
• Java code (one zip file containing three directories, one per case)  
• Textual description (a short paragraph per case)  
• List: assumptions (as many as you need) 