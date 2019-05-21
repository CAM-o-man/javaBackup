
package hendricks.lab93;

// DiceMain.java

/**
 * Class to test Dice
 * 
 * Simulates the rolling of two dice ten times, 
 *    printing the sum each time.
 *
 * @author andrianoff
 * @version June 25, 2014
 */
public class DiceMain {
	public static void main(String[] args) {
		Dice d = new Dice(6);
		Dice e = new Dice(6);
		int sum;
		
		for (int i = 0; i < 10; i++) {
			int die1 = d.roll();
			int die2 = e.roll();
			sum = die1 + die2;
			System.out.println("Die 1 rolled " + die1);
			System.out.println("Die 2 rolled " + die2);
			System.out.println("The roll is: " + sum);
			//exercise 4
		}
		//int times = 0;
		/*for (int i = 0; i < 100; i++) {
			System.out.println(d.roll());
			times = i;
		}
		System.out.println(times);*/
		//exercise 5
		int twelves = 0;
		for (int i = 0; i < 1000; i++) {
			if (d.roll()  + d.roll() == 12) {
				twelves++;
			}
		}
		System.out.println("Twelves in 1000 rolls: " + twelves);
		int doubles = 0;
		for (int i = 0; i < 1000; i++) {
			if (d.roll() == d.roll()) {
				doubles++;
			}
		}
		System.out.println("Doubles in 1000 rolls: " + doubles);
		int iter = 0;
		//noinspection ConditionalBreakInInfiniteLoop
		do {
			if (d.roll() == d.roll()) {
				break;
			}
			iter++;
		} while (true); //really no benefit
		System.out.println("It took " + iter + " rolls to get doubles.");


		twelves = 0;
		int[] combos = new int[11];
		for (int i = 0; i < 10000; i++) {
			switch (d.roll() + e.roll()) {
				case 2:
					combos[0]++;
				case 3:
					combos[1]++;
				case 4:
					combos[2]++;
				case 5:
					combos[3]++;
				case 6:
					combos[4]++;
				case 7:
					combos[5]++;
				case 8:
					combos[6]++;
				case 9:
					combos[7]++;
				case 10:
					combos[8]++;
				case 11:
					combos[9]++;
				case 12:
					combos[10]++;
				default:
					System.exit(-5);
			}
		}
	}
}
