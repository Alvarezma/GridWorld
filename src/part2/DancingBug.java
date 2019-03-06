import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug {
	
	private int[] pattern;
	private int place;
    

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug(int[] pattern) {
        place = 0;
        this.pattern = pattern;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
        for(int i = 0; i < pattern[place]; i++) {
            turn();
        }
		if (canMove()) {
			move();
		}
        place++;
        if (place >= pattern.length) {
            place = 0;
        }
	}
}
