PART 1

Set 1
1. No it does not some steps it will simply turn a diagonal direction and not move to another box. This happens in things such as corners.
2. It moves where ever its antenias are facing.
3. It turns right 45 degrees.
4. A bug leaves behind flowers when it moves.
5. The only change in behavior when a bug is at the edge of the grid is when the bug is facing the edge. If facing the edge the Bug will use steps to tuen away from the edge and continue moving on when the space in front of it is clear. Being at the edge is not important its whether or not there is an obstacle.
6. The bug will take a step to turn diagonal than the bug will move past it diagonally till it reaches another obstacle.
7. No they do not move but they can decay over time seen by the dulling of their colors.
8. Over time a flower will have its colors dulled this si in direct relation to the number of steps taken since its existance.
9. No a rock seems to be an unmovabel object that has no behavior besides blocking the movement of a bug.
10. No there cannot be more than one actor to a square. Flowers are destroyes as bugs move over them and beugs will avoid going into each other squares as if they were a rock.

Exercises 1
1. Degrees - Direction
0 - North
45 - NorthEast
90 - East
135 - SouthEast
180 - South
225 - SouthWest
270 - West
315 - NorthWest
360 - North
2. You can move it to any square on the grid with no distance limits. If you give it cordinates outsides the grid it throws and error at you.
3. setColor method
4. The bug got destroyed

PART 2

set 2
1. sideLength is the maximum ammount of steps a Box bug can take before turning.
2. Keeping track fo the steps taken and checking it against sideLength.
3. so that it turns 90 degrees and makes a corner for the sqaure it is creating.
4. Becasue it pulls that method from the Bug class it extends from.
5. Yes becasue there are yet to be any functions to change the sideLength which is only set at creation.
6. Yes if there were a new obstacle put in its way.
7. After it makes a 90 degree turn.

Exercises 2
1. The circle bug instead turns 45 degrees after a turn making more of a circle shape.
5. I would first create another BoxBug object then I would use that add() methos to add it to the world and that would create another BoxBug to the grid.

PART 3

set 3
1. loc1.getRow();
2. False
3. 4, 4
4. 135
5. It gets an angle of direction and returns the first grid in thsat direction

set 4
1. ArrayList<Location> getOccupiedLocations() and the number of spaces is the number of objects. You can use ArrayList<Location> getEmptyAdjacentLocations on a bunch of different places.
2. isValid(10, 10);
3. The code is not neccesary to know how to use it. There is no need to know how it exactly works but if ypu want to see that you can go into the code itself.
4. No an Array List provides much more flexibility in this sort of format and an Array would be hard to use.

set 5
1. Color, Direction, and location.
2. Direction is 0, Color is red.
3. Actor was created in a class to parent other classes that would be the actors on gridworld.
4. No once the actor is put in the grid it can't be put in again and once its gone the user cant interact with it. Also if it gets removed its impossible to add itself again.
5. It sets a new direction  using its current direction as a frame for reference.

set 6
1. The isValid check on the space it tries to move into prevents it from leaving the grid.
2. The fact that it will only return true if it is void or an instance of flower so if it is a rock it fails both of that and retruns false causing it to turn away.
3. getGrid() is used from the grid interface and ensures that the Bug is on the grid.
4. getAdjecentLocation(), getLocation(), isValid() are all location methods and they are used to interact with the surronding of the bug.
5. gr.get(location) is a method inherited from actor needed to teell what actor it is.
6. It will just removeSelfFromGrid() instead of moving into the space.
7. No its still needed to place down the flower.
8. When creating the flower it uses the only color it can access which is the current color of the bug to create it.
9. Yes it's still able to place down the flower even when it's been removed.
10. flower.putSelfInGrid(gr, loc); is the function that places the flower in the grid on the previous location.
11. 4

Group activity
1. 
a. It will jump onto the flower or rock destroying it will its massive weight.
b. It will not jump and instead turn 90 degrees.
c. Same as b.
d. It will turn away and not jump.
e. they will both turn 180 degress.
f. besides checking two spaces ahead and checking what actor is there nor no there is no other tests.
2. 
a. extends bug
b. all the bug classea are pretty similar all I have to do is change the canMove and move methods.
c. No there is no need for a constructor just a call to super.
d. act(), move(), and canMove() need to be overidded.
e. no methods need to be added.
f. putting it in the grid like any other class.

PART 4

set 7
1. act(), getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove().
2. getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove().
3. Yes because they may want to only pay attention to actors in front of them and may not want tot pay attention to all of them.
4. Eat them, change color, make them act.
5. getMoveLocations() obtains all the empty adjacent locations. selectMoveLocation() randomly selects a location from the list that getMoveLocations made. makeMove() moves itself to the selected location.
6. Doesn't need to make any new variables.

set8
1. As a result of the act() method using 5 other methods all thats needed to change its act is to individually change some of the methods. So the act method still calls processActors() and makeMove() but they are now different than they were before.
2. Because the only change to moving it wants to make is to also change the direction but once thats done it does the same makeMove() as before so there is no reason not to call the super.
3. I would have it save it's location call the super then make and place a flower where it was before using the saved location much like a bug does it.
4. There's no reason to change getActors as the only change in behavior is how the CHameleon proccesses them.
5. The actor class.
6. It can call the function in the Actor class of getGrid().

set9
1. Because the getActors() method is overode and it only passes the actors that it wants to eat into the processActors() method so there is no need to change it for the behavior to match up with what we want.
2. The crab will use its getActors() method to get all the actiors in the spaces directly in front and front-left and front-right it will then eat all the actors that aren't Rocks or Critters. It will then move and do the same process over again.
3. It's used so that the modified methods of getActors() and getMoveLocations() do not have to be heavily modified to keep track of direction and where the crab is searching and can instead give the getLocationsInDirections() and not have to worry about the process.
4. Could return (3, 5), (4, 5), and (2, 5).
5. A Critter grabs all the open locations around it as potential moves. A crab will only grab open positions to the right or left of it. The move function will choose a random location among the open positions The difference between them is that if the critter has no open locations it doesn't move but the crab will turn left or right.
6. Whether or not there are any open areas to the left or right of it.
7. There is a specific line of code in the processActors() method that will eat anything as long as its not a rock or another critter so they never eat each other.