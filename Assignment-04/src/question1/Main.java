package question1;






















/*
1. Vacation (150 total)
Write an abstract Vacation superclass encapsulating a vacation. There will be two concrete
subclasses , AllInclusiveVacation and PieceMealVacation. There is also a VacationTest class.
class Vacation (20)
It has instance variables:
private String destination
4
private double budget
It has a constructor with the two instance variables that calls the mutators for each of the
variables. There are also two accessor methods.
The setBudget method sets the budget if it is >= 0, otherwise it will
throw new IllegalArgumentException( "Budget must be >= 0.0")
The toString method returns a String with the Destination and Budget and moves to the next line
i.e.:
Destination: Orlando; Budget: $1000.00
The equals(Object obj) is overridden with a value of true if the destinations are the same (ignore
the case) and the budgets are within 0.0001.
It has an abstract method overbudget returning a double.
class AllInclusiveVacation extends Vacation (35)
It has instance variables:
private String brand;
private int rating – from 1 to 5
private double price
It has a constructor with the 5 instance variables: The first two are for the superclass.
The constructor calls super, and then calls the mutators for each of the remaining variables.
There are also three accessor methods.
The setRating method sets the rating if it is >= 1 and <=5, otherwise it will
throw new IllegalArgumentException( "Rating must be > 0 and <= 5")
The setPrice method sets the price if it is >= 0.0, otherwise it will
throw new IllegalArgumentException( "Price must be >= 0.0")
The toString method returns a String with the Destination and Budget (using super()) and the
three other instance values and moves to the next line i.e.:
Destination: Orlando; Budget: $1000.00
Brand: Disney; Rating: 4; Price: $989.49
The equals(Object obj) is overridden with a value of true if the conditions from the super class
are true and brand (ignore the case) and rating are equal, and the prices are within 0.0001.
It overrides overbudget returning by how much the vacation is over or under budget as a double.
class PieceMealVacation extends Vacation (45)
It has instance variables:
private String [] items – the list of items on the vacation
private double [] costs – the corresponding price of each item
It has a constructor with the 4 instance variables: The first two are for the superclass.
The constructor calls super, and then calls the mutators for each of the remaining variables
(remember that they are references to the two arrays).
There are also two accessor methods.
The setItems method accepts an array of items and uses it to create an object array items with the
same length, and then sets the items one by one.
The setCosts method accepts an array of costs (I call it newCosts) create an object array costs
with a length equal to the length of the array items. It then sets the costs one by one.
5
if newCosts is a bigger array, extra cost elements are ignored
if newCosts is a smaller array, missing cost elements are 0.0
The toString method returns a String with the Destination and Budget (using super()) and the line
by line itemization i.e.:
Destination: Miami; Budget: $1500.00
hotel: $750.00
meals: $250.00
airfare: $400.00
windsurfing: $0.00
The equals(Object obj) is overridden with a value of true if the conditions from the super class
are true and Each item is equal and the cost for each item is within 0.0001.
It overrides the overbudget method by calculating and returning by how much the vacation is
over or under budget as a double after summing the costs of all the items.
class VacationTest (50)
This class consists of a main program which tests the Vacation.
See below for a complete sample output.
Create an AllInclusiveVacation with parameters ( "Orlando", 2000.00 , "Universal", 4, 1979.49 )
Print out the AllInclusiveVacation.
Determine if it is on budget (within 0.0001), under budget or over budget and make the
appropriate printout.
Create a second AllInclusiveVacation with parameters ( "Virgin Islands", 2100.00, "Sandals", 4,
2350.99)
Print out the AllInclusiveVacation.
Determine if it is on budget (within 0.0001), under budget or over budget and make the
appropriate printout.
Set both the brand and price of the second AllInclusiveVacation to that of the first.
Print out whether they are equal.
Set both the destination and budget of the second AllInclusiveVacation to that of the first.
Print out whether they are equal.
Create an itemsList1 array with { "lodging", "meals", "airfare", " water skiing " }
Create a costsList1 array with { 750.00, 250.00, 400.00 }
Create a PieceMealVacation pmv1 with Honolulu and 1500.00 as the first two parameters and
references to the itemsList1 and costsList1 as the last two parameters
Print out the PieceMealVacation
Determine if it is on budget (within 0.0001), under budget or over budget and make the
appropriate printout.
Create an itemsList2 with { "lodging", "meals", "airfare", " water skiing " }
Create a costsList2 with { 750.00, 250.00, 400.00, 120.00, 200.00 }
Create a PieceMealVacation pmv2 with Honolulu and 1500.00 as the first two parameters and
references to the itemsList2 and costsList2 as the last two parameters
Print out the PieceMealVacation
Determine if it is on budget (within 0.0001), under budget or over budget and make the
appropriate printout.
6
Determine if pmv1 is equal to pmv2 and print out whether or not they are equal.
Then:
Set the pmv2 items to itemsList1
Set the pmv2 costs to costsList1
Print out whether they or not they are now equal.
Sample Output:
The first all-inclusive vacation is:
Destination: Orlando; Budget: $2000.00
Brand: Universal; Rating: 4; Price: $1979.49
It is under budget by $20.51
The second all-inclusive vacation is:
Destination: Virgin Islands; Budget: $2100.00
Brand: Sandals; Rating: 4; Price: $2350.99
It is over budget by $250.99
aiv1 and aiv2 are not equal
aiv1 and aiv2 are now equal
The first piecemeal vacation is:
Destination: Honolulu; Budget: $1500.00
lodging: $750.00
meals: $250.00
airfare: $400.00
water skiing: $0.00
It is under budget by $100.00
The second piecemeal vacation is:
Destination: Honolulu; Budget: $1500.00
lodging: $750.00
meals: $250.00
airfare: $400.00
water skiing: $120.00
It is over budget by $20.00
pmv1 and pmv2 are not equal
pmv1 and pmv2 are now equal

 */