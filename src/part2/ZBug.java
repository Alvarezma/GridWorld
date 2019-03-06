import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug {
	
	private int steps;
	private int length;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		this.length = length;
        turn();
        turn();
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
        if (!canMove()) {
            return;
        }
		if (steps <= length * 3) {
            if(steps == length)  {
                turn();
                turn();
                turn();
            } else if(steps == length * 2)  {
                turn();
                turn();
                turn();
                turn();
                turn();
            }
			move();
			steps++;
		}
	}
}