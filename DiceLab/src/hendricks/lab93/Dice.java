package hendricks.lab93;
//  Dice.java

/**
 * Implements a Dice object (a die)
 * 
 * @author andrianoff
 * @version June 25, 2014
 */
public class Dice {
	/**
	 * Constructs a die
	 */
	public final int sides;
	public Dice(int sides) {
		this.sides = sides;
	}	

	/**
	 * Rolls a die - generates a random number in the range 1 .. 6
	 * @return the face value of the die
	 */
	public int roll() {
		return (int) (Math.random()*this.sides) + 1;
	}


	@Override
	public String toString() {
		return "sides = " + this.sides;
	}
}