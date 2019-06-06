package hendricks.oops;

import java.util.Scanner;

/**
 * @author Connor McDermid
 * @lab OOPS Monster
 * @date 2019.06.05
 * @extra Final variables (finally a chance to use them)
 */
public class MonsterRunner {

    public static void main(String[] args) {
        System.out.println("Input the first monster's name and size.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int size = Integer.parseInt(input.nextLine()); //Preventing errors with using nextLine earlier
        Monster monstera = new Monster(size, name);
        System.out.println("Now the second monster, please.");
        name = input.nextLine();
        size = Integer.parseInt(input.nextLine());
        Monster monsterb = new Monster(size, name);

        if (monstera.isLarger(monsterb)) {
            System.out.println(monstera.getName() + "is larger than " + monsterb.getName());
        } else {
            System.out.println(monstera.getName() + "is smaller than " + monsterb.getName());
        }
    }
}
